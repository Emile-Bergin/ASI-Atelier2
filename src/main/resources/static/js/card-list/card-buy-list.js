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

    fetch('http://localhost:8080/api/card/list/sell', myInit)
        .then(function(response) { 
            response.json().then( el => {
                this.setList(el);
            })
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
            .replace(/{{price}}/g, card.price)
        clone.firstElementChild.innerHTML = newContent;
        
        let cardContainer = document.querySelector("#tableContent");
        cardContainer.appendChild(clone);
    }
}

function buyCard(idCard) {

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
            console.log(user);
                const buyCard = {
                    method: 'POST',
                    headers: myHeaders,
                    mode: 'cors',
                    cache: 'default',
                    body: JSON.stringify({
                        idUser: user.id,
                        idCard: parseInt(idCard, 10)
                    })
                };

                fetch('http://localhost:8080/api/card/buy', buyCard)
                    .then(function(response) { 
                        response.json().then( res => {
                            console.log(res);
                        })
                    });
            })
        });
}


