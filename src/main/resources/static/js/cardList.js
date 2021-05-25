let cardList = [
        {
            family_name:"DC Comic",
            img_src:"http://www.superherobroadband.com/app/themes/superhero/assets/img/superhero.gif",
            name:"SUPERMAN",
            description: "The origin story of Superman relates that he was born Kal-El on the planet Krypton, before being rocketed to Earth as an infant by his scientist father Jor-El, moments before Krypton's destruction. Discovered and adopted by a farm couple from Kansas, the child is raised as Clark Kent and imbued with a strong moral compass. Early in his childhood, he displays various superhuman abilities, which, upon reaching maturity, he resolves to use for the benefit of humanity through a 'Superman' identity.",
            hp: 500,
            energy:100,
            attack:50,
            defense: 50,
            price:200
        },
        {
            family_name:"DC Comic",
            img_src:"https://static.fnac-static.com/multimedia/Images/8F/8F/7D/66/6716815-1505-1540-1/tsp20171122191008/Lego-lgtob12b-lego-batman-movie-lampe-torche-batman.jpg",
            name:"BATMAN",
            description: "Bruce Wayne, alias Batman, est un héros de fiction appartenant à l'univers de DC Comics. Créé par le dessinateur Bob Kane et le scénariste Bill Finger, il apparaît pour la première fois dans le comic book Detective Comics no 27 (date de couverture : mai 1939 mais la date réelle de parution est le 30 mars 1939) sous le nom de The Bat-Man. Bien que ce soit le succès de Superman qui ait amené sa création, il se détache de ce modèle puisqu'il n'a aucun pouvoir surhumain. Batman n'est qu'un simple humain qui a décidé de lutter contre le crime après avoir vu ses parents se faire abattre par un voleur dans une ruelle de Gotham City, la ville où se déroulent la plupart de ses aventures. Malgré sa réputation de héros solitaire, il sait s'entourer d'alliés, comme Robin, son majordome Alfred Pennyworth ou encore le commissaire de police James Gordon. ",
            hp: 50,
            energy:80,
            attack:170,
            defense: 80,
            price:100
        },
        {
            family_name:"Marvel",
            img_src:"https://static.hitek.fr/img/actualite/2017/06/27/i_deadpool-2.jpg",
            name:"DEAD POOL",
            description: "Le convoi d'Ajax est attaqué par Deadpool. Il commence par massacrer les gardes à l'intérieur d'une voiture, avant de s'en prendre au reste du convoi. Après une longue escarmouche, où il est contraint de n'utiliser que les douze balles qu'il lui reste, Deadpool capture Ajax (dont le véritable nom est Francis, ce que Deadpool ne cesse de lui rappeler). Après l'intervention de Colossus et Negasonic venus empêcher Deadpool de causer plus de dégâts et le rallier à la cause des X-Men, Ajax parvient à s'échapper en retirant le sabre de son épaule. Il apprend par la même occasion la véritable identité de Deadpool : Wade Wilson.",
            hp: 999999,
            energy:100,
            attack:15,
            defense: 15,
            price:250
        },

    ]
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

    fetch('http://localhost:8080/api/card/list', myInit)
        .then(function(response) { 
            response.json().then( el => {
                console.log(el);
                this.setList(el);
            })
        });
}

function setList(list) {
    for(const card of list){
        let clone = document.importNode(template.content, true);
    
        newContent= clone.firstElementChild.innerHTML
                    .replace(/{{title}}/g, card.title)
                    .replace(/{{description}}/g, card.description)
                    .replace(/{{family_name}}/g, card.family.name)
                    .replace(/{{type_name}}/g, card.type.name)
                    .replace(/{{health_point}}/g, card.healthPoint)
                    .replace(/{{price}}/g, card.price);
        clone.firstElementChild.innerHTML= newContent;
    
        let cardContainer= document.querySelector("#tableContent");
        cardContainer.appendChild(clone);
    }
}


