function validate() {
    var ten = document.myform.ten.value;
    var ma = document.myform.ma.value;

    if (ma == "") {
        alert("Vui lòng nhập mã");
        return false;
    }
    if (ten == "") {
        alert("Vui lòng nhập tên");
        return false;
    } else {
        return true;
    }


}