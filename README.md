MenuItemSearchAction
====================

Android MenuItem with an expandable and collapsable ActionView for search purposes (needs `ActionBarSherlock` to work)

Usage
-----
1. Copy files to your project
2. Let your fragment or class implement the `SearchPerformListener`

	implements SearchPerformListener
	
3. In your onCreateOptionsMenu add the following: 

	MenuItemSearchAction menuItemSearchAction = new MenuItemSearchAction(getActivity(), menu, this);
	
4. Add the res/strings.xml to your strings xml or just add the following two lines:

	<string name="menu_item_search_action_hint">Your Search Query</string>
    <string name="menu_item_search_action_menu_text">Search</string>
