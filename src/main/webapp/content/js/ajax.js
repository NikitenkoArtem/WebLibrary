function loadXml(action){
    var xhr = new XMLHttpRequest();
    var libraryName = document.getElementById("libraryName").value;
    var readerId = document.getElementById("readerId").value;
    var bookName = document.getElementById("bookName").value;

    xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            console.log(xhr.responseText);
        }
    }
    xhr.open("GET", "librarian/info", true);
    xhr.send("action=" + action + "&libraryName=" + libraryName + "&readerId=" + readerId);
}