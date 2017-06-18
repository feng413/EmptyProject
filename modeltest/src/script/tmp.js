//Define Class
function Msg(msg) {
    this.content = msg;
}

Msg.prototype.show = function(){
    document.write(this.content);
};

function showMsg(){
    var tmpMsg = new Msg("input msg");
    tmpMsg.show();
}