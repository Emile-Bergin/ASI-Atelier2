$(document ).ready(function() {
    $("#submit").click(function () {
        var data = {username: $("#username").val(), password: $("#surname").val(), password: $("#password").val()};
        console.log(data);
        $.post({
            url: "api/auth/signup",
            data: data,
            success: function(data, status, xhr){console.log(status)},
        });
    });
});