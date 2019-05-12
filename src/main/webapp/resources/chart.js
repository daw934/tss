var dataTab = [];
var chart;
var number = 1;
var chartInterval;
var socketConn = new WebSocket('ws://localhost:8080/socketHandler');

function StartSocket() {
    getData();
    chartInterval = setInterval(send, 1000);
}


var socketConn = new WebSocket('ws://localhost:8080/socketHandler');

function send() {
    socketConn.send("");
}


socketConn.onmessage = function (event) {
    console.log(event.data);
    // dataTab = event.data.replace( /^\D+/g, '');
    console.log(dataTab);
    number = number + 1;
    chart.data.labels.push(number);
    chart.data.datasets[0].data.push(event.data);
    chart.update();
    // getData2();
    // var serverMsg = document.getElementById('serverMsg');
    // serverMsg.value = event.data;
};


function getData() {
    // send();
    $("#socketDiv").append("<canvas id='line-chart' width='800' height='450'></canvas>");
    var ctx = document.getElementById('line-chart').getContext('2d');
    chart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: [number],
            datasets: [{
                data: dataTab,
                label: "Data",
                borderColor: "#3e95cd",
                fill: true
            }
            ]
        },
        options: {
            title: {
                display: true,
                text: 'Random data from server'
            }
        }
    });
}

function getData2() {
    number = number + 1;
    chart.data.labels.push(number);
    chart.data.datasets[0].data.push(data);
    chart.data.datasets.forEach(function (value) {
        value.data.push(data);
    });
    chart.update();
    console.log("data loaded" + chart.data.datasets[0].data.forEach(function (value) {
        console.log(value)
    }));
}
