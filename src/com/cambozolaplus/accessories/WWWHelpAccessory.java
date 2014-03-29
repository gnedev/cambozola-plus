/**
 ** com/cambozolaplus/accessories/WWWHelpAccessory.java
 **  Copyright (C) George Nedev, 2014.
 **  Copyright (C) Andy Wilcock, 2003.
 **  Available from http://code.google.com/p/cambozola-plus/
 **
 **  Cambozola is free software; you can redistribute it and/or modify
 **  it under the terms of the GNU General Public License as published by
 **  the Free Software Foundation; either version 2 of the License, or
 **  (at your option) any later version.
 **
 **  Cambozola is distributed in the hope that it will be useful,
 **  but WITHOUT ANY WARRANTY; without even the implied warranty of
 **  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 **  GNU General Public License for more details.
 **
 **  You should have received a copy of the GNU General Public License
 **  along with Cambozola; if not, write to the Free Software
 **  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 **/
package com.cambozolaplus.accessories;

import com.cambozolaplus.Accessory;
import com.cambozolaplus.ViewerAttributeInterface;
import com.cambozolaplus.profiles.ICameraProfile;
import com.cambozolaplus.shared.AppID;

import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;

public class WWWHelpAccessory extends Accessory
{
	public WWWHelpAccessory()
	{
		super();
	}

    public String getName()
    {
        return "Help [from the web]";
    }

    public String getDescription()
    {
        return "Displays web help page";
    }

    public boolean isEnabled(ICameraProfile profile, ViewerAttributeInterface vfi)
    {
        return !vfi.isStandalone();
    }

    public String getIconLocation()
    {
        return "assets/www.gif";
    }

    public void actionPerformed(Point p, ViewerAttributeInterface vfi)
    {
        AppID props = AppID.getAppID();
        try {
            StringBuffer helpurl = new StringBuffer(props.getHelpURL());
            //
            // Go there...
            //
            vfi.displayURL(new URL(helpurl.toString()), null);
        } catch (MalformedURLException mfe) {
        }
    }
}
