Ultimate_Theme_UI_Template
==========================

The ultimate open source Android theme and icon pack template

![Screenshot] (http://designrifts.com/wp-content/uploads/2013/10/Screenshot_2013-10-07-07-58-21.png)

This project utilizes tabs and a `CardListView` to provide 3 (or more) swipable tabs that each have their own Card UI ListView for different actions.

The tabs are utilizing: https://github.com/astuetz/PagerSlidingTabStrip

The cards are utilizing: https://github.com/afollestad/Cards-UI

Please ensure you grab the Silk library from the Cards-UI library as well.

At the current moment, I am not including the libraries in the code so you will need to import them in order for this to work. I will include the libraries in the future. A brief explanation of the functionality:

The Theme Activity
==========================

The `ThemeActivity` contains the main functionality and calls to the tabs...
The tabs are "Theme", "Extras", "Contact" and "About." 

**Theme** includes cards to apply in multiple launchers (Action Launcher, ADWEX Launcher, Apex Launcher, Nova Launcher, Smart Launcher and Go Launcher EX).
**Extras** includes cards for your Play Store link, Wallpapers, Icons (this displays icons included using `string-arrays` in the `icon_pack`), an activity that will scan the device it is installed on, capture the activity names and their icons and zip it to send.
It also includes Cards to do with as your choice, I have added UCCW and Zooper in their as place holders as well as some fun.
**Contact** included cards for social media, email and web.

The Icon Activity
==========================
The `IconActivity` calls to the different icon category tabs.
The `IconFragment` displays each category using a string-array located in the icon_pack.xml in values
The icon section will be modified in the future; I will be implementing new code that will auto display based on file name (i.e. **apps_**, **system_**, **misc_**) which will get rid of the `string-arrays`.

Feel free to contact me for questions via the Google+ or Facebook links. Do not ask me how to make a theme, I will not help you. I will however provide direction to using the template.

UI Customization
==========================
With the Oct. 16th update, I have added the ability to customize many items inside the app, these include:
Action Bar
Card Background
Background
Tab Color
Card Color
Card Title Color

The properties for these items are located in 'colors.xml'. To properly implement, you also need to update your CardsUI library

You Must
==========================
By agreeing to use this source, you are agreeing you have a sense of humor. 

What's Planned
==========================
I have moved most hardcoded text to be string resources, and will expand more as well as expand supported launchers and their additional features (GO features, etc).

More Notes
==========================
The purpose of using `wallpaper_default` is Nova does not have an action to apply a default wallpaper, and Smart Launcher uses "Wall0" for theirs.
In `FragmentTheme` it applies the `wallpaper_default` on Nova or Smart apply. You can use this as well to be your default for the rest so you don't duplicate an image.
If you are smart, you would convert the Smart Launcher images to XML files, and point them to images you already have instead of duplicating images.




