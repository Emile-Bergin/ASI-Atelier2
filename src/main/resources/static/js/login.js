$(document ).ready(function() {
    $("#submit").click(function () {
        var data = {username: $("#username").val(), password: $("#password").val()};
        console.log(data);
        $.post({
            url: "/login",
            data: data,
            success: function(data, status, xhr){console.log(status)},
        });
    });
});