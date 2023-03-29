$(() => {

    let isOpen = false;

    $(".rankers").children().on({
        mouseover: function () {
            // console.log("open");
            let boxWidth = $(this).parent().css("width");
            let totalWrapMargin = $(".total-wrap").css("marginLeft");
            let sectionMargin = $(".total-wrap").css("width");

            let boxMargin = parseInt(totalWrapMargin) + parseInt(sectionMargin) / 50;

            let openTest = $("#ranker ");
            // console.log(openTest)
            
            // console.log(isOpen);

            for(let idx = 0; idx < openTest.length; idx++){
                if(openTest[idx].style.display === 'gird'){
                    isOpen = true;
                } // if
                // console.log(openTest[idx].style.display);

            } // for

            // console.log(isOpen);

            // console.log($("#rankers "));
            // console.log(boxWidth);
            // console.log(boxMargin);

            
            if (!isOpen) {
                $(this).children().children("#ranker").css("display", "grid");
                $(this).children().children("#ranker").css("width", boxWidth);
                $(this).children().children("#ranker").css("left", boxMargin);
                isOpen = true;
            }
        } // mouseover  
    })

    const rankersClose = function() {
        $("#ranker ").css("display", "none");
        isOpen = false;
    }

    $("*").on({
        click: function () {
            rankersClose();
        }
    }) // click 발생시 ranker 상세창 닫기

    $(window).resize(function () {
        rankersClose();
    });

}) // .jq