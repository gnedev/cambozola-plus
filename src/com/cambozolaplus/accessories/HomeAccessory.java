/**
 ** com/cambozolaplus/accessories/HomeAccessory.java
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

import java.awt.Point;

public class HomeAccessory extends Accessory
{
	public HomeAccessory()
	{
		super();
	}

    public String getName()
    {
        return "Home View";
    }

    public String getDescription()
    {
        return "Resets the view to show the complete stream image";
    }

    public String getIconLocation()
    {
        return "assets/home.gif";
    }

    public boolean isEnabled(ICameraProfile profile, ViewerAttributeInterface vfi)
    {
        return super.isEnabled(profile, vfi) && (profile.supportsPan() || profile.supportsTilt() || profile.supportsZoom());
    }

    public void actionPerformed(Point p, ViewerAttributeInterface vfi)
    {
        vfi.getProfile().homeView();
    }
}
