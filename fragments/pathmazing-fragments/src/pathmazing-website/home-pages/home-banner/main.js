const content = fragmentElement.querySelector(".home-banner");

let images = [
  "https://pathmazing.com/img/home-banner.png",
  "https://pathmazing.com/img/bg-home1-new.jpg",
  "https://pathmazing.com/img/bg-home2-new.jpg",
  "https://pathmazing.com/img/bg-home3-new.jpg"
];
// let index = 0;
// setInterval(function () {
//   $("#banner-image")
//     .fadeOut(function () {
//       $('#banner-image').css("background-image", "url(" + images[index] + ")");
//     })
//     .fadeIn('slow');
//
//   index++;
//   if (index === images.length) index = 0;
// }, 3000);

// slider homepage
$("#slideshow > div:gt(0)").hide();
setInterval(function() {
  $("#slideshow > div:first")
    .fadeOut(1000)
    .next()
    .fadeIn(1000)
    .end()
    .appendTo("#slideshow");
}, 4000);
