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
            if (response.ok) {
                response.json().then( user => {
                    this.setUserInfo(user);
                })
            } else {
                document.location.href = './login.html'
            }
        });
}

function setUserInfo(user) {
    let walletView = document.getElementById("wallet");
    let nameView = document.getElementById("name");

    walletView.innerHTML = user.wallet+' €';
    nameView.innerHTML = user.name;
}

function logout() {
    var myHeaders = new Headers();

    var myInit = {
        method: 'GET',
        headers: myHeaders,
        mode: 'cors',
        cache: 'default'
    };

    fetch('http://localhost:8080/api/auth/logout', myInit)
        .then(function(response) {
            if (response.ok) {
                    document.location.reload();
            } else {
                document.location.href = './login.html'
            }
        });
}