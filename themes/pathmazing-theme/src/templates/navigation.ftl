<nav class="${nav_css_class}" id="navigation" role="navigation">
	<h1 class="hide-accessible"><@liferay.language key="navigation" /></h1>

	<#--<ul aria-label="<@liferay.language key="site-pages" />" role="menubar" style="display: flex; justify-content: end; width: 100%; background-color: red">
		<#list nav_items as nav_item>
			<#assign
				nav_item_attr_has_popup = ""
				nav_item_css_class = ""
				nav_item_layout = nav_item.getLayout()
			/>

			<#if nav_item.isSelected()>
				<#assign
					nav_item_attr_has_popup = "aria-haspopup='true'"
					nav_item_css_class = "selected"
				/>
			</#if>

			<li class="${nav_item_css_class}" id="layout_${nav_item.getLayoutId()}" role="presentation">
				<a aria-labelledby="layout_${nav_item.getLayoutId()}" ${nav_item_attr_has_popup} href="${nav_item.getURL()}" ${nav_item.getTarget()} role="menuitem"><span><@liferay_theme["layout-icon"] layout=nav_item_layout /> ${nav_item.getName()}</span></a>

				<#if nav_item.hasChildren()>
					<ul class="child-menu" role="menu">
						<#list nav_item.getChildren() as nav_child>
							<#assign
								nav_child_css_class = ""
							/>

							<#if nav_item.isSelected()>
								<#assign
									nav_child_css_class = "selected"
								/>
							</#if>

							<li class="${nav_child_css_class}" id="layout_${nav_child.getLayoutId()}" role="presentation">
								<a aria-labelledby="layout_${nav_child.getLayoutId()}" href="${nav_child.getURL()}" ${nav_child.getTarget()} role="menuitem">${nav_child.getName()}</a>
							</li>
						</#list>
					</ul>
				</#if>
			</li>
		</#list>
	</ul>-->
	<div class="navigation-list-container" id="navigation-list-container" aria-label="<@liferay.language key="site-pages" />" role="menubar">
		<#list nav_items as nav_item>
			<#assign
			nav_item_attr_has_popup = ""
			nav_item_css_class = ""
			nav_item_layout = nav_item.getLayout()
			/>
			<#if nav_item.isSelected()>
				<#assign
				nav_item_attr_has_popup = "aria-haspopup='true'"
				nav_item_css_class = "selected"
				/>
			</#if>
			<div class="${nav_item_css_class}" id="layout_${nav_item.getLayoutId()}" role="presentation" style="padding-left: 16px;">
				<a aria-labelledby="layout_${nav_item.getLayoutId()}" ${nav_item_attr_has_popup} href="${nav_item.getURL()}" ${nav_item.getTarget()} role="menuitem"><span id="nav-items"><@liferay_theme["layout-icon"] layout=nav_item_layout /> ${nav_item.getName()}</span></a>
				<#if nav_item.hasChildren()>
					<div class="child-menu" role="menu">
						<#list nav_item.getChildren() as nav_child>
							<#assign nav_child_css_class = ""/>
							<#if nav_item.isSelected()>
								<#assign nav_child_css_class = "selected" />
								<div class="${nav_child_css_class}" id="layout_${nav_child.getLayoutId()}" role="presentation">
									<a aria-labelledby="layout_${nav_child.getLayoutId()}" href="${nav_child.getURL()}" ${nav_child.getTarget()} role="menuitem">${nav_child.getName()}</a>
								</div>
							</#if>
						</#list>
					</div>
				</#if>
			</div>
		</#list>
	</div>
</nav>