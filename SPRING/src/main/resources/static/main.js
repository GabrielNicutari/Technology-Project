/**
 *
 */

$('document').ready(function() {

    $('.deleteButton').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal();
    });


        $('.editButton').on('click',function(event){

            event.preventDefault();

            var href = $(this).attr('href');

            $.get(href, function(game, status) {
                $('#idEdit').val(game.id);
                $('#nameEdit').val(game.name);
                $('#genreEdit').val(game.genre);
                $('#ratingEdit').val(game.rating);
                $('#modeEdit').val(game.mode);
                $('#releaseDateEdit').val(game.releaseDate);
                $('#developerEdit').val(game.developer);
                $('#publisherEdit').val(game.publisher);
                $('#engineEdit').val(game.engine);
            });

            $('#editModal').modal();
        });

});
