console.log("yousk2");
this.getUserData();
function getUserData() {
    var myHeaders = new Headers();

    var myInit = {
        method: 'GET',
        headers: myHeaders,
        mode: 'cors',
        cache: 'default'
    };

    fetch('http://localhost:8080/api/user', myInit)
        .then(function(response) { 
            response.json().then( el => {
                console.log(el);
                this.setUserInfo(el);
            })
        });
}

function setUserInfo(user) {
    let walletView = document.getElementById("wallet");
    let nameView = document.getElementById("name");

    walletView.innerHTML = user.wallet+' €';
    nameView.innerHTML = user.name;
}