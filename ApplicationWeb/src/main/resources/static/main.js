
$(document).ready( function () {
    var table = $('#tacheTable').DataTable({
           "sAjaxSource": "/taches",
           "sAjaxDataProp": "",
           "order": [[ 0, "asc" ]],
           "aoColumns": [
                { "mData": "Tache"},
           ]
    })
});