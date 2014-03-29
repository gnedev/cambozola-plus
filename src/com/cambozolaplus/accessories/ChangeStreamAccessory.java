/**
 ** com/cambozolaplus/accessories/ChangeStreamAccessory.java
 **  Copyright (C) George Nedev, 2014.
 **  Copyright (C) Andy Wilcock, 2004.
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
import java.net.URL;

public class ChangeStreamAccessory extends Accessory
{
	private int current = 0;

	public ChangeStreamAccessory()
	{
		super();
	}
    public String getName()
    {
        return "Change Stream";
    }

    public String getIconLocation()
    {
        return "assets/changeStream.gif";
    }

    public String getDescription()
    {
        return "Change the current stream";
    }

	public boolean isEnabled(ICameraProfile profile, ViewerAttributeInterface vfi)
	{
		return (vfi.getAlternateURLs().size() > 1);
	}

    public void actionPerformed(Point p, ViewerAttributeInterface vfi)
    {
	    int size = vfi.getAlternateURLs().size();
	    if (size == 0)
	    {
		    return;
	    }
        int center = Accessory.BUTTON_SIZE/2;
        if (Math.abs(center - p.x) < 1)
        {
            return; // in the middle - too close to call.
        }
        boolean hitRight = (p.x > center);
	    int shift = (hitRight)?1:-1;
	    current = (current + shift + size)%size;
	    //
	    URL nu = (URL)vfi.getAlternateURLs().elementAt(current);
	    //System.err.println("New Current stream = #" + current + " - " + nu);
	    vfi.setCurrentURL(nu);
	    vfi.getViewArea().reset();
        vfi.repaint();
    }
}
