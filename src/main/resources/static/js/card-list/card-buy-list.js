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

    fetch('http://localhost:8080/api/card/list/0', myInit)
        .then(function(response) { 
            response.json().then( el => {
                console.log(el);
                this.setList(el);
            })
        });
}

function setList(list) {
    for (const card of list) {
        let clone = document.importNode(template.content, true);

        newContent = clone.firstElementChild.innerHTML
            .replace(/{{title}}/g, card.title)
            .replace(/{{description}}/g, card.description)
            .replace(/{{family_name}}/g, card.family.name)
            .replace(/{{type_name}}/g, card.type.name)
            .replace(/{{health_point}}/g, card.healthPoint)
            .replace(/{{price}}/g, card.price);
        clone.firstElementChild.innerHTML = newContent;

        let cardContainer = document.querySelector("#tableContent");
        cardContainer.appendChild(clone);
    }
}


