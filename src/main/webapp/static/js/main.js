$('#search_id').submit(function(event){
  event.preventDefault();
  $("#server-results").empty();
  $.getJSON($(this).attr("action"), $(this).serialize(), function(response) {
      $.each(response, function(key, val) {
            $("#server-results").append( key + ": " + val + "<br />");
        });
    });
});

$('#search_title').submit(function(event){
  event.preventDefault();
  $("#title-results").empty();
  $.get($(this).attr("action"), $(this).serialize(), function(response) {
      var string = '';
      $.each(response, function( index, value ) {
        string += '<tr><td>' + value.id
        + '</td><td>' + value.title
        + '</td><td>' + value.price
        + '</td><td>' +value.nbpage + '</td><td>';

        if(value.publisher != undefined){
            string +=  value.publisher.name;
        }
        string +=  '</td><td>'
        if(value.authors != undefined){
            var virgule = '';
            $.each(value.authors, function( index, valueauthors ) {
                string +=  virgule + valueauthors.name;
                virgule = ', ';
                })
        }
        string += '</td><td>'
        string += '<button type="button" onclick="myFunction(' + value.id + ')">X</button>'
        string += '</td></tr>';
      });
      $("#title-results").append(string);
  });
});

function myFunction (id) {
    $.ajax({
                url: 'rest/book/' + id,
                type: 'DELETE'
        });
    };