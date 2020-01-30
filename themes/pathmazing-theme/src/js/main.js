AUI().ready(
    /*
    This function gets loaded when all the HTML, not including the portlets, is
    loaded.
    */

    function () {

    }
);

Liferay.Portlet.ready(
    /*
    This function gets loaded after each and every portlet on the page.

    portletId: the current portlet's id
    node: the Alloy Node object of the current portlet
    */

    function (portletId, node) {
    }
);

Liferay.on(
	'allPortletsReady',

	function() {
		var heading = document.getElementById('heading-home').style;

		var site_logo_container = document.getElementById('site-logo-container').style;
		var site_logo = document.getElementById('site-logo').style;

		var nav_items_container = document.getElementById('navigation-list-container');

		var footer_container = document.getElementById('footer-container');
		var footer_site_logo = document.getElementById('footer-site-logo');
		var footer_site_logo_container = document.getElementById('footer-site-logo-container');
		var footer_navigation_items_container = document.getElementById('footer-navigation-container');

		window.onload = function() {
			onWindowReside();
			alert("Onload");
		};

		$(window).on("resize", function(event){
			onWindowReside();
		});

		$(window).scroll(function(){
			if($(window).scrollTop() > 50){
				if ($(this).width() > 720){
					onScrolledNavigation();
				} else{
					if (this.oldScroll > this.scrollY) {
						heading.opacity = '1.0';
						heading.zIndex = '999';
					} else {
						heading.opacity = '0.0';
						heading.zIndex = '-1';
					}
					this.oldScroll = this.scrollY;
				}
			} else {
				if ($(this).width() > 720){
					onScrolledToTop();
					if($(this).width() > 1010){
						heading.padding = '24px 12%';
					} else {
						heading.padding = '32px 24px';
					}
				} else {
					heading.opacity = '1.0';
					heading.zIndex = '999';
				}
			}
		});

		function onWindowReside() {
			if($(this).width() > 1010){
				heading.padding = '24px 12%';
				footerNormal();
				if ($(window).scrollTop() > 50){
					onScrolledNavigation();
				} else {
					onScrolledToTop();
				}
			} else if(($(this).width() < 1010) && ($(this).width() > 720)) {
				heading.padding = '32px 24px';
				footerNormal();
				if ($(window).scrollTop() > 50){
					onScrolledNavigation();
				} else {
					onScrolledToTop();
				}
			} else {
				heading.display = 'flex';
				heading.flexDirection = 'column';
				heading.backgroundColor = 'rgba(32,34,35,0.7)';
				heading.padding = '8px 24px';
				heading.position = 'fixed';
				heading.zIndex = '999';
				heading.width = '100%';
				heading.height = 'auto';

				nav_items_container.style.justifyContent = 'flex-start';
				nav_items_container.style.paddingTop = '8px';
				nav_items_container.style.margin = '0';
				nav_items_container.style.overflowX = 'auto';

				site_logo.margin = 'auto 0px';
				site_logo.height = '50px';
				site_logo.width = '60%';

				footerSmallSize();
			}
		}
		function onScrolledNavigation() {
			heading.display = 'flex';
			heading.flexDirection = 'row';
			heading.backgroundColor = 'rgba(32,34,35,0.7)';
			heading.padding = '8px 24px 8px 16px';
			heading.alignItems = 'baseline';
			heading.position = 'fixed';
			heading.zIndex = '999';
			heading.width = '100%';
			heading.height = 'auto';

			heading.opacity = '1.0';

			site_logo_container.maxWidth = '320px';

			nav_items_container.style.justifyContent = 'flex-end';

			site_logo.margin = 'auto 0px';
			site_logo.height = '50px';
			site_logo.width = '90%';
			site_logo.minWidth = '250px';
		}
		function onScrolledToTop() {
			site_logo.margin = 'auto 0px';
			site_logo.height = '70%';
			site_logo.width = '90%';
			site_logo.minWidth = '250px';

			site_logo_container.maxWidth = '620px';

			nav_items_container.style.justifyContent = 'flex-end';

			heading.display = 'flex';
			heading.flexDirection = 'row';
			heading.alignItems = 'baseline';
			heading.zIndex = '999';
			heading.width = '100%';
			heading.background  = 'linear-gradient(to top, rgba(8, 8, 8, 0), rgba(8, 8, 8, 0.62), #080808)';
			heading.height = '211px';

			heading.opacity = '1.0';
		}
		function footerNormal() {
			footer_container.style.backgroundColor = '$dark-black';
			footer_container.style.display = 'flex';
			footer_container.style.flexDirection = 'row';
			footer_container.style.alignItems = 'baseline';
			footer_container.style.padding = '16px 10%';
			footer_container.style.justifyContent = 'none';

			footer_site_logo_container.style.maxWidth = '360px';
			footer_site_logo_container.style.width = 'auto';
			footer_site_logo_container.style.justifyContent = 'flex-start';
			footer_site_logo_container.style.padding = '0';

			footer_site_logo.style.height = '56px';
			footer_site_logo.style.width = '300px';

			footer_navigation_items_container.style.display = 'flex';
			footer_navigation_items_container.style.justifyContent = 'flex-end';

		}
		function footerSmallSize() {
			footer_container.style.justifyContent = 'center';

			footer_site_logo_container.style.maxWidth = '100%';
			footer_site_logo_container.style.padding = '8px 0 0 0';

			footer_site_logo.style.height = '78px';
			footer_site_logo.style.width = '75%';

			footer_navigation_items_container.style.display = 'none';
		}
	}
);

$(function () {
    new WOW().init();
});

