use(function () {
    var res = resource.getResourceResolver().getResource('/content/mysite/myoptions/colornodes');
    return {
        result: res
    };
});