const vm = new Vue({
    el: '.vue',
    data() {
        return {
            D: {},
            E: {},
            F: {},

        }
    },
    created() {
        let rq = new XMLHttpRequest()
        rq.open("GET", "2.json", true)
        rq.onreadystatechange = function () {
            if (rq.readyState == 4 && rq.status == 200) {
                this.D = JSON.parse(rq.responseText)
            }
        }
        rq.send()
        this.E = JSON.parse(`{"A":"123","B":"456"}`)

        this.F = {"A":"123","B":"456"}
    },

    template: `
        <h1>{{ D.A }} {{ E.A }} {{ F.A }}</h1>
    `,
});
