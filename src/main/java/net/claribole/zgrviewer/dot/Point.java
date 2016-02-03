/*   FILE: Point.java
 *   DATE OF CREATION:   Apr 4 2005
 *   AUTHOR :            Eric Mounhem (skbo@lri.fr)
 *   Copyright (c) INRIA, 2004-2005. All Rights Reserved
 *   Licensed under the GNU LGPL. For full terms see the file COPYING.
 * 
 * $Id: Point.java 576 2007-03-29 18:32:53Z epietrig $
 */

package net.claribole.zgrviewer.dot;

/**
 * Point coordinates in GraphViz style (points can have multiple dimensions
 * instead of 2)
 * @author Eric Mounhem
 */
public class Point {
    private boolean  change;
    private long[] coords;

    /**
     * Create a new point. Depending on dimension used, you must fill coords
     * with the right number of elements.
     * 
     * @param change
     */
    public Point(boolean change) {
        this.setChange(change);
    }

    /**
     * @see Object#toString()
     */
    public String toString() {
        String p = "";
        if (this.getCoords() != null) {
            for (int i = 0; i < this.getCoords().length; i++) {
                if (i > 0)
                    p += ",";
                p += this.getCoords()[i];
            }
        }
        return p + (this.isChange() ? "" : "!");
    }

    /**
     * Indicates whether the node position can be changed
     */
    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }

    /**
     * Coordinates of the point. It may have an arbitrary dimension.
     */
    public long[] getCoords() {
        return coords;
    }

    public void setCoords(long[] coords) {
        this.coords = coords;
    }
}
