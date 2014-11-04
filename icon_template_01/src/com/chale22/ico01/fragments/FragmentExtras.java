/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chale22.ico01.fragments;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.afollestad.cardsui.Card;
import com.afollestad.cardsui.CardAdapter;
import com.afollestad.cardsui.CardBase;
import com.afollestad.cardsui.CardHeader;
import com.afollestad.cardsui.CardListView;
import com.afollestad.cardsui.CardListView.CardClickListener;
import com.chale22.ico01.R;




public class FragmentExtras extends Fragment  implements Card.CardMenuListener<Card> {
	
	private CardListView list;
	//The below items are the actions attached to the cards, i.e. what the cards will do, if you will not be using a card, you can remove the act
    private void actPlay() {
    	Uri marketuriString = Uri.parse(getString(R.string.play_link)); 
    	Intent playintent = new Intent(Intent.ACTION_VIEW, marketuriString);
    	try {
    		startActivity(playintent);
    	} catch (ActivityNotFoundException e2) {
    		e2.printStackTrace();
    		Toast.makeText(getActivity().getApplicationContext(), "Play Store not found!", Toast.LENGTH_LONG).show();
    	}
    };
    //The following act relates to the information to link to the github and forum posts of this template, you are free to remove 
    private void actGithub() {
    	 Uri extras1uriString = Uri.parse(getString(R.string.github_link)); //use this to link to your UCCW skins on Play or Website
       Intent extras1Intent = new Intent("android.intent.action.VIEW", extras1uriString);
       try {
    		  startActivity(extras1Intent);
    		} catch (ActivityNotFoundException e2) {
    		  e2.printStackTrace();
    		}

    };
    //The following act relates to the information to link to the github and forum posts of this template, you are free to remove 
    private void actRootzwiki() {
    	 Uri extras1uriString = Uri.parse(getString(R.string.rootzwiki_link)); //use this to link to your UCCW skins on Play or Website
       Intent extras1Intent = new Intent("android.intent.action.VIEW", extras1uriString);
       try {
    		  startActivity(extras1Intent);
    		} catch (ActivityNotFoundException e2) {
    		  e2.printStackTrace();
    		}

    };
    //The following act relates to the information to link to the github and forum posts of this template, you are free to remove 
    private void actXDA() {
    	 Uri extras1uriString = Uri.parse(getString(R.string.xda_link)); //use this to link to your UCCW skins on Play or Website
       Intent extras1Intent = new Intent("android.intent.action.VIEW", extras1uriString);
       try {
    		  startActivity(extras1Intent);
    		} catch (ActivityNotFoundException e2) {
    		  e2.printStackTrace();
    		}

    };
    private void actWallpapers() {
    	String pkg = getResources().getString(R.string.pkg);
    	Intent wallpapers = new Intent(Intent.ACTION_MAIN);
    	wallpapers.setComponent(new ComponentName(pkg,pkg+".wallpaper"));

    	try {        
            startActivity(wallpapers);
    		}
    	catch (RuntimeException wall) {
    		wall.printStackTrace();
    	}
    };
    private void actIcons() {
    	String pkg = getResources().getString(R.string.pkg);
    	Intent iconfrag = new Intent(Intent.ACTION_MAIN);
    	iconfrag.setComponent(new ComponentName(pkg,pkg+".IconActivity"));

    	try {        
            startActivity(iconfrag);
    		}
    	catch (RuntimeException icons) {
    		icons.printStackTrace();
    	}
    };
    private void actRequest() {
    	String pkg = getResources().getString(R.string.pkg);
    	Intent iconrequest = new Intent(Intent.ACTION_MAIN);
    	iconrequest.setComponent(new ComponentName(pkg,pkg+".IconRequest"));

    	try {        
            startActivity(iconrequest);
    		}
    	catch (RuntimeException icons) {
    		icons.printStackTrace();
    	}
    };
    private void actUCCW() {
   	 Uri uccwuriString = Uri.parse(getString(R.string.uccw_link)); 
      Intent uccwIntent = new Intent("android.intent.action.VIEW", uccwuriString);
      try {
   		  startActivity(uccwIntent);
   		} catch (ActivityNotFoundException e2) {
   		  e2.printStackTrace();
   		}

   };
   private void actZooper() {
	   	 Uri zooperuriString = Uri.parse(getString(R.string.zooper_link)); 
	      Intent zooperIntent = new Intent("android.intent.action.VIEW", zooperuriString);
	      try {
	   		  startActivity(zooperIntent);
	   		} catch (ActivityNotFoundException e2) {
	   		  e2.printStackTrace();
	   		}

	};
    private void actExtras1() {
     	 Uri extras1uriString = Uri.parse(getString(R.string.extras1_link)); //use this to link to your UCCW skins on Play or Website
        Intent extras1Intent = new Intent("android.intent.action.VIEW", extras1uriString);
        try {
     		  startActivity(extras1Intent);
     		} catch (ActivityNotFoundException e2) {
     		  e2.printStackTrace();
     		}

     };
    private void actExtras2() {
      	 Uri extras2uriString = Uri.parse(getString(R.string.extras2_link)); //use this to link to your UCCW skins on Play or Website
         Intent extras2Intent = new Intent("android.intent.action.VIEW", extras2uriString);
         try {
      		  startActivity(extras2Intent);
      		} catch (ActivityNotFoundException e2) {
      		  e2.printStackTrace();
      		}

      };
	   

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_extras, container, false);

		list = (CardListView) view.findViewById(R.id.ListView);
		
		list.setOnCardClickListener(new CardClickListener() {
			public void onCardClick(AdapterView<?> adapter, View view, int position, long arg) {
				Object listItem = list.getItemAtPosition(position);
			}
			
			//The below section is what tells the card to perform the above action when clicked
			@Override
			public void onCardClick(int position, CardBase card, View view) {
				String str = card.getTitle();
				if (str.equals(getString(R.string.play))) {
					actPlay();
				}
				//The following if relates to the information to link to the github and forum posts of this template, you are free to remove 
				if (str.equals(getString(R.string.github))) {
					actGithub();
				}
				//The following act relates to the information to link to the github and forum posts of this template, you are free to remove 
				if (str.equals(getString(R.string.rootzwiki))) {
					actRootzwiki();
				}
				//The following act relates to the information to link to the github and forum posts of this template, you are free to remove 
				if (str.equals(getString(R.string.xda))) {
					actXDA();
				}
				if (str.equals(getString(R.string.wallpaper))) {
					actWallpapers();
				}
				if (str.equals(getString(R.string.icon))) {
					actIcons();
				}
				if (str.equals(getString(R.string.request))) {
					actRequest();
				}
				if (str.equals(getString(R.string.uccw))) {
					actUCCW();
				}
				if (str.equals(getString(R.string.zooper))) {
					actZooper();
				}
				if (str.equals(getString(R.string.extras1))) {
					actExtras1();
				}
				if (str.equals(getString(R.string.extras2))) {
					actExtras2();
				}
			}
		});
		return view;
	}

	@Override
	public void onStart() {
		super.onStart();

		CardAdapter<Card> cardsAdapter = new CardAdapter<Card>(getActivity())
				.setAccentColorRes(R.color.card_text)
				.setPopupMenu(R.menu.extras_popup, this);

		cardsAdapter.add(new CardHeader(getActivity(), R.string.playheader)
				);
		cardsAdapter.add(new Card(getString(R.string.play), getString(R.string.play_extra))
				.setThumbnail(getActivity(),R.drawable.apps_googleplaystore) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				);
		cardsAdapter.add(new CardHeader(getActivity(), R.string.template_header)
				);
		cardsAdapter.add(new Card(getString(R.string.github), getString(R.string.github_extra))
				.setThumbnail(getActivity(),R.drawable.apps_github)  // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 
		cardsAdapter.add(new Card(getString(R.string.rootzwiki), getString(R.string.rootzwiki_extra))
				.setThumbnail(getActivity(), R.drawable.apps_rootzwiki) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 	
		cardsAdapter.add(new Card(getString(R.string.xda), getString(R.string.xda_extra))
				.setThumbnail(getActivity(), R.drawable.apps_xda) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 
		cardsAdapter.add(new CardHeader(getActivity(), R.string.basicsheader)
				);
		cardsAdapter.add(new Card(getString(R.string.wallpaper), getString(R.string.wallpaper_extra))
				.setThumbnail(getActivity(),R.drawable.system_gallery)  // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 
		cardsAdapter.add(new Card(getString(R.string.icon), getString(R.string.icon_extra))
				.setThumbnail(getActivity(), R.drawable.icon) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 	
		cardsAdapter.add(new Card(getString(R.string.request), getString(R.string.request_extra))
				.setThumbnail(getActivity(), R.drawable.apps_iconrequest) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 
		cardsAdapter.add(new CardHeader(getActivity(), R.string.extrasheader)
				);
		//If you are not going to link to a UCCW theme, either direct or through Play, remove the action above
		//in the OnCardClick. so it doesnt try to do anything. Optionally and recommended would be to remove actUCCW and the card
		cardsAdapter.add(new Card(getString(R.string.uccw), getString(R.string.uccw_extra))
				.setThumbnail(getActivity(),R.drawable.apps_uccw) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 	
		//If you are not going to link to a Zooper widget, either direct or through Play, remove the action above
		//in the OnCardClick. so it doesnt try to do anything. Optionally and recommended would be to remove actZooper and the card
		cardsAdapter.add(new Card(getString(R.string.zooper), getString(R.string.zooper_extra))
				.setThumbnail(getActivity(),R.drawable.apps_zooperwidget) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 			
		//Below are example cards to a link if you wanted additional extras
		cardsAdapter.add(new Card(getString(R.string.extras1), getString(R.string.extras1_extra))
				.setThumbnail(getActivity(), R.drawable.jai) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 								
		cardsAdapter.add(new Card(getString(R.string.extras2), getString(R.string.extras2_extra))
				.setThumbnail(getActivity(),R.drawable.amasan25) // sets a thumbnail image from drawable resources
				.setPopupMenu(-1, null) // -1 disables the popup menu for this individual card
				); 										

		list.setAdapter(cardsAdapter);
	}
	

	public void onMenuItemClick(Card card, MenuItem item) {
	    Toast.makeText(getActivity(), card.getTitle() + ": " + item.getTitle(), Toast.LENGTH_SHORT).show();
	}
    
    
}
