const pageTitle = document.currentScript.getAttribute("title");
getUserData();

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
    document.getElementById("header").innerHTML = getHeader(user);
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

function getHeader(user) {
    return `<div class="w-full h-24 bg-red-800" >
                <div class="flex flex-row text-white h-full items-center">
                    <div class="flex flex-row w-1/3 text-lg font-semibold ml-4">
                        <div class="flex flex-row-reverse mr-2">${user.name}</div>
                        -
                        <div class="ml-2" id="wallet">${user.wallet} €</div>
                    </div>
                    <div class="text-2xl font-bold w-1/3 text-center" id="page_title">${pageTitle}</div>
                    <div class="flex flex-row-reverse w-1/3 mr-4">
                        <div class="border-2 border-white rounded-lg w-32 h-10 cursor-pointer text-center text-lg hover:bg-red-500 px-2 font-bold" onclick="logout()">
                            ${'  Déconnexion  '}
                        </div>
                    </div>
                </div>
            </div>`
}