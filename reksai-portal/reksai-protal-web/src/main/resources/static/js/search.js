function search(page) {
    var fileName = $('.search').val();
    $(".search-form").append("<input type='hidden' name='current' value='" + page + "'>");
    $('.search-form').submit();
}

$('.pager-item').click(function () {
    var page = $(this).attr("current");
    if(page) {
        search(page)
    }

})