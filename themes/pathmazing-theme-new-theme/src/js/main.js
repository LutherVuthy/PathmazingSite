AUI().ready(

	/*
	This function gets loaded when all the HTML, not including the portlets, is
	loaded.
	*/

	function() {
	}
);

Liferay.Portlet.ready(

	/*
	This function gets loaded after each and every portlet on the page.

	portletId: the current portlet's id
	node: the Alloy Node object of the current portlet
	*/

	function(portletId, node) {
	}
);

Liferay.on(
	'allPortletsReady',

	/*
	This function gets loaded when everything, including the portlets, is on
	the page.
	*/

	function() {
		var navigation_container = document.getElementById('navigation-item-container');
		var _oldScroll = 0;
		var _offset = 1;
		$(window).scroll(function(){
			if($(window).scrollTop() > _oldScroll){
				onNavigationFullScreen();
			} else {
				onNavigationPadding();
			}
			_oldScroll = $(window).scrollTop();
		});

		var loc = navigation_container.offsetTop;
		if (loc > _offset + 9){
			onDisplayNavigationOnSmallScreen();
			_offset = navigation_container.offsetTop;
		} else if (loc < _offset - 9) {
			onDisplayNavigationOnNormalScreen();
			_offset = navigation_container.offsetTop;
		}

		/*$(window).on("resize", function(event){
			var loc = navigation_container.offsetTop;
			if (loc > _offset + 9){
				onDisplayNavigationOnSmallScreen();
			} else if (loc < _offset - 9) {
				onDisplayNavigationOnNormalScreen();
			}
			_offset = navigation_container.offsetTop;
		});*/
	}
);

var nav_heading = document.getElementById('heading');
var navigation_items_container = document.getElementById('navigation-items-container');
var navigation_container = document.getElementById('navigation-item-container');
var heading = document.getElementById('heading');
var site_logo_container = document.getElementById('site-logo-and-title-container');
var button_show_nav = document.getElementById('button-show-nav-items-container');
var isShowNavigation = false;
function onNavigationFullScreen() {
	nav_heading.style.display = 'flex';
	nav_heading.style.flexDirection = 'row';
	nav_heading.style.padding = '8px 16px';
	nav_heading.style.alignItems = 'baseline';
	nav_heading.style.zIndex = '999';
	nav_heading.style.width = '100%';
	nav_heading.style.marginLeft = '0';
	nav_heading.style.marginTop = '0';
	nav_heading.style.backgroundColor = 'rgba($nav_background_color, 0.9)';
	nav_heading.style.borderRadius = '0';
	nav_heading.style.position = 'fixed';
	nav_heading.style.opacity = '1.0';
	nav_heading.style.justifyContent = 'space-between';
}

function onNavigationPadding() {
	nav_heading.style.display = 'flex';
	nav_heading.style.flexDirection = 'row';
	nav_heading.style.padding = '8px 16px';
	nav_heading.style.alignItems = 'baseline';
	nav_heading.style.zIndex = '999';
	nav_heading.style.width = '80%';
	nav_heading.style.marginLeft = '10%';
	nav_heading.style.marginTop = '16px';
	nav_heading.style.backgroundColor = 'rgba($nav_background_color, 0.9)';
	nav_heading.style.borderRadius = '5px';
	nav_heading.style.position = 'fixed';
	nav_heading.style.opacity = '1.0';
	nav_heading.style.justifyContent = 'space-between';
}

function onDisplayNavigationOnSmallScreen(){
	navigation_container.style.display = 'none';
	navigation_items_container.style.justifyContent = 'flex-start';
	button_show_nav.style.display = 'flex';
	// site_logo_container.style.maxWidth = '100%';
}

function onDisplayNavigationOnNormalScreen(){
	navigation_container.style.display = 'flex';
	navigation_items_container.style.justifyContent = 'flex-end';
	heading.style.alignItems = 'baseline';
	button_show_nav.style.display = 'none';
    navigation_container.style.marginTop = '8px';
	// site_logo_container.style.maxWidth = '30%';
}
function displayNavigationItemsOnSmallDevice() {
	if (isShowNavigation){
		hideNavigationItems();
		isShowNavigation = false;
	} else {
		showNavigationItems();
		isShowNavigation = true;
	}
}
function hideNavigationItems() {
	navigation_container.style.display = 'none';
	navigation_items_container.style.justifyContent = 'flex-start';
}
function showNavigationItems() {
	navigation_container.style.display = 'flex';
	navigation_items_container.style.justifyContent = 'flex-start';
	navigation_container.style.marginTop = '8px';
}