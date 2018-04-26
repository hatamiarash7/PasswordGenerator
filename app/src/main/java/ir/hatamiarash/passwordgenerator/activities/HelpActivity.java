package ir.hatamiarash.passwordgenerator.activities;

import android.content.Context;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import ir.hatamiarash.passwordgenerator.R;
import ir.hatamiarash.passwordgenerator.helpers.ExpandableListAdapter;
import ir.hatamiarash.passwordgenerator.helpers.HelpDataDump;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * @author Karola Marky
 * @version 20160617
 */
public class HelpActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		
		ExpandableListAdapter expandableListAdapter;
		HelpDataDump helpDataDump = new HelpDataDump(this);
		
		ExpandableListView generalExpandableListView = findViewById(R.id.generalExpandableListView);
		
		LinkedHashMap<String, List<String>> expandableListDetail = helpDataDump.getDataGeneral();
		List<String> expandableListTitleGeneral = new ArrayList<>(expandableListDetail.keySet());
		expandableListAdapter = new ExpandableListAdapter(this, expandableListTitleGeneral, expandableListDetail);
		generalExpandableListView.setAdapter(expandableListAdapter);
		
		overridePendingTransition(0, 0);
	}
	
	protected int getNavigationDrawerID() {
		return R.id.nav_help;
	}
	
	@Override
	protected void attachBaseContext(Context newBase) {
		super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
	}
}

