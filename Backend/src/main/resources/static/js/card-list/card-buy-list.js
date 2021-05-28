const template = document.querySelector("#row");
const defaultGetHeader = new Headers;
const defaultGetInit = {
    method: 'GET',
    headers: defaultGetHeader,
    mode: 'cors',
    cache: 'default'
};

let buyCardHeader = new Headers;
buyCardHeader.append("Content-Type", "application/json")
const buyCardInit = {
    method: 'POST',
    headers: buyCardHeader,
    mode: 'cors',
    cache: 'default',
    body: {}
};

this.getCardList();

function getCardList() {

    fetch('http://localhost:8080/api/card/list/sell', defaultGetInit)
        .then(function(response) { 
            if (response.ok) {
                response.json().then( cards => {
                    this.setList(cards);
                })
            } else {
                this.setList();
            }
        });
}

function setList(list = []) {
    let templateList = '';
    for (let card of list) {
        templateList += funcCardList(card, 'buy');
    }
    console.log('templateList :>> ', templateList);
    document.getElementById("row").innerHTML = templateList;
}

function buyCard(idCard) {

    fetch('http://localhost:8080/api/user', defaultGetInit)
    .then(function(responseUser) { 
        responseUser.json().then( user => {
            buyCardInit.body = JSON.stringify({
                idUser: user.id,
                idCard: parseInt(idCard, 10)
            })

            fetch('http://localhost:8080/api/card/buy', buyCardInit)
                .then(function(responseBuyCard) { 
                    responseBuyCard.json().then( res => {
                        if (res == true) {
                            document.location.reload();
                        } else {
                            alert("Impossible d'acheter cette carte");
                        }
                    })
                });
            })
        });
}

