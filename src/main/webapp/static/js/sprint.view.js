$(function() {

    $(".well").on("click", "#delete-sprint-link", function(e) {
        e.preventDefault();

        var storyDeleteDialogTempate = Handlebars.compile($("#template-delete-sprint-confirmation-dialog").html());

        $("#view-holder").append(storyDeleteDialogTempate());
        $("#delete-sprint-confirmation-dialog").modal();
    })

    $("#view-holder").on("click", "#cancel-sprint-button", function(e) {
        e.preventDefault();

        var deleteConfirmationDialog = $("#delete-sprint-confirmation-dialog")
        deleteConfirmationDialog.modal('hide');
        deleteConfirmationDialog.remove();
    });

    $("#view-holder").on("click", "#delete-sprint-button", function(e) {
        e.preventDefault();
        window.location.href = "/sprint/delete/" + $("#sprint-id").text();
    });
});
