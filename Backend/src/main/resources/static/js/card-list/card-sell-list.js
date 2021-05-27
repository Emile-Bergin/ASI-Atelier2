let template = document.querySelector("#row");
this.getCardList();

function getCardList() {

    var myHeaders = new Headers();

    var myInit = {
        method: 'GET',
        headers: myHeaders,
        mode: 'cors',
        cache: 'default'
    };


    fetch('http://localhost:8080/api/card/list/user', myInit)
        .then(function (response) {
            if (response.ok) {
                response.json().then( cards => {
                    this.setList(cards);
                })
            }
        });
}

function setList(list) {
    for (const card of list) {
        let clone = document.importNode(template.content, true);

        newContent = clone.firstElementChild.innerHTML
            .replace(/{{id}}/g, card.id)
            .replace(/{{title}}/g, card.title)
            .replace(/{{description}}/g, card.description)
            .replace(/{{family_name}}/g, card.family.name)
            .replace(/{{type_name}}/g, card.type.name)
            .replace(/{{type_color}}/g, card.type.color)
            .replace(/{{health_point}}/g, card.healthPoint)
            .replace(/{{price}}/g, card.price);
        clone.firstElementChild.innerHTML = newContent;

        let cardContainer = document.querySelector("#tableContent");
        cardContainer.appendChild(clone);
    }
}

function sellCard(idCard) {
    const myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    const getUser = {
        method: 'GET',
        headers: myHeaders,
        mode: 'cors',
        cache: 'default'
    };

    
    fetch('http://localhost:8080/api/user', getUser)
    .then(function(response) { 
        response.json().then( user => {
            const sellCard = {
                method: 'POST',
                headers: myHeaders,
                mode: 'cors',
                cache: 'default',
                body: JSON.stringify({
                    idUser: user.id,
                    idCard: parseInt(idCard, 10)
                })
            };

            fetch('http://localhost:8080/api/card/sell', sellCard)
                .then(function(response) { 
                    response.json().then( res => {
                        if (res == true) {
                            document.location.reload();
                        } else {
                            alert("Impossible de vendre cette carte");
                        }
                    })
                });
            })
        });
}