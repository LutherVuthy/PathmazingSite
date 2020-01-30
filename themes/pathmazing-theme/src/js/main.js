AUI().ready(
    function () {
        onWindowReside();
    }
);

Liferay.Portlet.ready(
    function (portletId, node) {
    }
);

Liferay.on(
	'allPortletsReady',

	function() {
        var _oldScroll = 0;

		window.onload = function() {
			onWindowReside();
		};

		$(window).on("resize", function(event){
			onWindowReside();
		});

        try {
            var heading = document.getElementById('heading-home').style;

            $(window).scroll(function(){
                if($(window).scrollTop() > 50){
                    if ($(this).width() > 720){
                        onScrolledNavigation();
                    } else{
                        if (_oldScroll > this.scrollY) {
                            heading.opacity = '1.0';
                            heading.zIndex = '999';
                        } else {
                            heading.opacity = '0.0';
                            heading.zIndex = '-1';
                        }
                        _oldScroll = this.scrollY;
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
        }
        catch(err) {
            var heading_small_screen = document.getElementById('heading').style;

            $(window).scroll(function(){
                if($(window).scrollTop() > 50){
                    if ($(this).width() > 720){
                        onScrolledNavigation();
                    } else{
                        if (_oldScroll > this.scrollY) {
                            heading_small_screen.opacity = '1.0';
                            heading_small_screen.zIndex = '999';
                        } else {
                            heading_small_screen.opacity = '0.0';
                            heading_small_screen.zIndex = '-1';
                        }
                        _oldScroll = this.scrollY;
                    }
                } else {
                    if ($(this).width() < 720){
                        heading_small_screen.opacity = '1.0';
                        heading_small_screen.zIndex = '999';
                    }
                }
            });
        }
	}
);

var site_logo_container = document.getElementById('site-logo-container').style;
var site_logo = document.getElementById('site-logo').style;

var nav_items_container = document.getElementById('navigation-list-container');

var footer_container = document.getElementById('footer-container');
var footer_site_logo = document.getElementById('footer-site-logo');
var footer_site_logo_container = document.getElementById('footer-site-logo-container');
var footer_navigation_items_container = document.getElementById('footer-navigation-container');

var button_show_nav_items_container = document.getElementById('button-show-nav-items-container');
var site_logo_and_title_container = document.getElementById('site-title-and-logo-container');
var navigation_container = document.getElementById('navigation-container');

var isShowNavItems = false;

function onWindowReside() {

    try {
        var heading = document.getElementById('heading-home').style;

        if($(this).width() > 1010){
            heading.padding = '24px 12%';
            navigationDisplayNormal();
            footerNormal();
            if ($(window).scrollTop() > 50){
                onScrolledNavigation();
            } else {
                onScrolledToTop();
            }
            if (isShowNavItems){
                heading.padding = '16px 0';
                hideNavigationItems();
            }
        } else if(($(this).width() < 1010) && ($(this).width() > 720)) {
            heading.padding = '32px 24px';
            navigationDisplayNormal();
            footerNormal();
            if ($(window).scrollTop() > 50){
                onScrolledNavigation();
            } else {
                onScrolledToTop();
            }
            if (isShowNavItems){
                heading.padding = '16px 0';
                hideNavigationItems();
            }
        } else {
            navigationResizeOnDifferentPage(heading);
            footerSmallSize();
        }
    }
    catch(err) {
        var heading_small_screen = document.getElementById('heading').style;

        if($(this).width() > 1010){
            navigationDisplayNormal();
            footerNormal();
            if ($(window).scrollTop() > 50){
                onScrolledNavigation();
            } else {
                onScrolledToTop();
            }
            if (isShowNavItems){
                heading_small_screen.padding = '16px 0';
                hideNavigationItems();
            }
        } else if(($(this).width() < 1010) && ($(this).width() > 720)) {
            navigationDisplayNormal();
            footerNormal();
            if ($(window).scrollTop() > 50){
                onScrolledNavigation();
            } else {
                onScrolledToTop();
            }
            if (isShowNavItems){
                heading_small_screen.padding = '16px 0';
                hideNavigationItems();
            }
        } else {
            navigationResizeOnDifferentPage(heading_small_screen);
            footerSmallSize();
        }
    }
}
function onScrolledNavigation() {

    try {
        var heading = document.getElementById('heading-home').style;
        onNavigationScrollOnDifferentPage(heading);
    }
    catch(err) {
        var heading_small_screen = document.getElementById('heading').style;
        onNavigationScrollOnDifferentPage(heading_small_screen);
    }
}
function onScrolledToTop() {

    try {
        var heading = document.getElementById('heading-home').style;

        site_logo.margin = 'auto 0px';
        site_logo.height = '70%';
        site_logo.width = '90%';
        site_logo.minWidth = '250px';

        site_logo_container.maxWidth = '620px';

        nav_items_container.style.justifyContent = 'flex-end';
        navigation_container.style.justifyContent = 'flex-end';

        heading.display = 'flex';
        heading.flexDirection = 'row';
        heading.alignItems = 'baseline';
        heading.zIndex = '999';
        heading.width = '100%';
        heading.background  = 'linear-gradient(to top, rgba(8, 8, 8, 0), rgba(8, 8, 8, 0.62), #080808)';
        heading.height = '211px';

        heading.opacity = '1.0';
    }
    catch(err) {
        var heading_small_screen = document.getElementById('heading').style;

        heading_small_screen.display = 'flex';
        heading_small_screen.flexDirection = 'row';
        heading_small_screen.backgroundColor = 'rgba(32,34,35,0.7)';
        heading_small_screen.padding = '16px';
        heading_small_screen.alignItems = 'baseline';
        heading_small_screen.position = 'fixed';
        heading_small_screen.zIndex = '999';
        heading_small_screen.width = '100%';
        heading_small_screen.height = 'auto';

        heading_small_screen.opacity = '1.0';

        site_logo_container.maxWidth = '320px';

        nav_items_container.style.justifyContent = 'flex-end';
        navigation_container.style.justifyContent = 'flex-end';

        site_logo.margin = 'auto 0px';
        site_logo.height = '50px';
        site_logo.width = '90%';
        site_logo.minWidth = '250px';
    }
}
function footerNormal() {
    // footer_container.style.backgroundColor = '$dark-black';
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

function navigationDisplayNormal() {
    navigation_container.style.display = 'flex';
    footer_navigation_items_container.style.justifyContent = 'flex-end';
    button_show_nav_items_container.style.display = 'none';
    button_show_nav_items_container.style.opacity = '0.0';
    navigation_container.style.marginTop = '0';
    navigation_container.style.backgroundColor = 'transparent';
}

function navigationResizeOnDifferentPage(_heading) {
    _heading.display = 'flex';
    _heading.flexDirection = 'column';
    _heading.backgroundColor = 'rgba(32,34,35,0.85)';
    _heading.position = 'fixed';
    _heading.zIndex = '999';
    _heading.width = '100%';
    _heading.height = 'auto';
    if (!isShowNavItems){
        _heading.padding = '16px 0';
    }

    nav_items_container.style.justifyContent = 'flex-start';
    nav_items_container.style.paddingTop = '8px';
    nav_items_container.style.margin = '0';
    nav_items_container.style.overflowX = 'auto';

    site_logo_container.maxWidth = '620px';

    site_logo_and_title_container.style.margin = '0 16px';

    site_logo.margin = 'auto 0px';
    site_logo.height = '50px';
    site_logo.width = '60%';
    site_logo.minWidth = '250px';

    // site_logo_and_title_container.style.width = '100%';

    button_show_nav_items_container.style.display = 'flex';
    button_show_nav_items_container.style.opacity = '1.0';
    button_show_nav_items_container.style.width = '100%';
    button_show_nav_items_container.style.justifyContent = 'flex-end';
    footer_navigation_items_container.style.justifyContent = 'flex-start';

    navigation_container.style.marginTop = '16px';
    navigation_container.style.backgroundColor = 'rgba(40, 44, 45, 0.7)';
    navigation_container.style.width = '100%';
    navigation_container.style.padding = '8px 16px 16px 16px';

    if (isShowNavItems){
        navigation_container.style.display = 'flex';
        navigation_container.style.justifyContent = 'flex-start';
        navigation_container.style.backgroundColor = 'rgba(40, 44, 45, 0.7)';

    } else {
        navigation_container.style.display = 'none';
        navigation_container.style.justifyContent = 'flex-start';
        navigation_container.style.backgroundColor = 'transparent';
    }
}

function onNavigationScrollOnDifferentPage(_heading) {
    _heading.display = 'flex';
    _heading.flexDirection = 'row';
    _heading.backgroundColor = 'rgba(32,34,35,0.7)';
    _heading.padding = '16px';
    _heading.alignItems = 'baseline';
    _heading.position = 'fixed';
    _heading.zIndex = '999';
    _heading.width = '100%';
    _heading.height = 'auto';

    _heading.opacity = '1.0';

    site_logo_container.maxWidth = '320px';
    nav_items_container.style.justifyContent = 'flex-end';
    navigation_container.style.justifyContent = 'flex-end';

    site_logo.margin = 'auto 0px';
    site_logo.height = '50px';
    site_logo.width = '90%';
    site_logo.minWidth = '250px';
}

function displayNavigationItemsOnSmallDevice(){
    try {
        var _heading = document.getElementById('heading-home').style;
        if (isShowNavItems){
            _heading.padding = '16px 0';
            navigation_container.style.display = 'none';
            navigation_container.style.backgroundColor = 'transparent';
            footer_navigation_items_container.style.justifyContent = 'flex-start';
            navigation_container.style.justifyContent = 'flex-start';
            navigation_container.style.marginTop = '16px';
            isShowNavItems = false;
        } else {
            _heading.padding = '16px 0 0 0';
            navigation_container.style.display = 'flex';
            navigation_container.style.backgroundColor = 'rgba(40, 44, 45, 0.7)';
            footer_navigation_items_container.style.justifyContent = 'flex-start';
            navigation_container.style.justifyContent = 'flex-start';
            navigation_container.style.marginTop = '16px';
            isShowNavItems = true;
        }
    }
    catch(err) {
        var heading_small_screen = document.getElementById('heading').style;
        if (isShowNavItems){
            heading_small_screen.padding = '16px 0';
            hideNavigationItems();
        } else {
            heading_small_screen.padding = '16px 0 0 0';
            navigation_container.style.display = 'flex';
            navigation_container.style.backgroundColor = 'rgba(40, 44, 45, 0.7)';
            footer_navigation_items_container.style.justifyContent = 'flex-start';
            navigation_container.style.justifyContent = 'flex-start';
            navigation_container.style.marginTop = '16px';
            isShowNavItems = true;
        }
    }
}

function hideNavigationItems() {
    navigation_container.style.display = 'none';
    navigation_container.style.backgroundColor = 'transparent';
    footer_navigation_items_container.style.justifyContent = 'flex-start';
    navigation_container.style.justifyContent = 'flex-start';
    navigation_container.style.marginTop = '16px';
    isShowNavItems = false;
}

$(function () {
    new WOW().init();
});

