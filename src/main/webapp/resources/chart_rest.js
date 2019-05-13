var chart;

function StartRest() {
    getData();
}

function getData() {
    $.ajax({
        url: "http://localhost:8080/rest/data",
        type: "GET",
        crossDomain: true,
        success: function (data) {
            console.log(data);
            console.log("data loaded ");
            $("#restDiv").append("<canvas id='line-chart' width='800' height='350'></canvas>");
            var ctx = document.getElementById('line-chart').getContext('2d');
            chart = new Chart(ctx, {
                type: 'line',
                data: {
                    labels: [1,2,3,4,5,6,7,8,9,10],
                    datasets: [{
                        data: data,
                        label: "Data",
                        borderColor: "#3e95cd",
                        fill: true
                    }]
                },
                options: {
                    title: {
                        display: true,
                        text: 'Random data from server'
                    }
                }
            });
        }
    });
}