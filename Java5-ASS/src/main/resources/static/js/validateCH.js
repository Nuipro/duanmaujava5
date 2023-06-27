function validate() {
    var ten = document.myform.ten.value;

    var dia_chi = document.myform.dia_chi.value;
    var ma = document.myform.ma.value;

    if (ma == "") {
        alert("Vui lòng nhập mã");
        return false;
    }
    if (ten == "") {
        alert("Vui lòng nhập tên");
        return false;
    }
    if (dia_chi == "") {
        alert("Vui lòng nhập địa chỉ");
        return false;
    } else {
        return true;
    }


}