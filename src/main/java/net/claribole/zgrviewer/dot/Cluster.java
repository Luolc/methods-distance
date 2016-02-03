/*   FILE: Cluster.java
 *   DATE OF CREATION:   Apr 4 2005
 *   AUTHOR :            Eric Mounhem (skbo@lri.fr)
 *   Copyright (c) INRIA, 2004-2005. All Rights Reserved
 *   Licensed under the GNU LGPL. For full terms see the file COPYING.
 * 
 * $Id: Cluster.java 576 2007-03-29 18:32:53Z epietrig $
 */

package net.claribole.zgrviewer.dot;

import java.awt.Color;

/**
 * A cluster is more or less a subgraph.
 * @author Eric Mounhem
 */
public class Cluster extends SubGraph {
    /**
     * Color used as the background for entire canvas
     */
    //Color  bgcolor;
    /**
     * Bounding box's color
     */
    private Color  pencolor  = Color.black;
    /**
     * Label justification (CENTER, LEFT or RIGHT)
     */
    //int    labeljust = Graph.CENTER;
    /**
     * Label localisation (TOP or BOTTOM)
     */
    //int    labelloc  = Graph.TOP;
    /**
     * Spring constant used in virtual physical model
     */
    private double k         = 0.3;
    /**
     * Label position (in points)
     */
    //Point  lp;

    /**
     * Create a cluster
     * 
     * @param root
     *            root graph
     * @param id
     *            identificator of the Cluster
     * @throws Exception
     *             Exception thrown when no id is given
     */
    public Cluster(Object root, String id) throws Exception {
        super(root, id);
    }
    
    public Cluster(Object root) throws Exception {
        super(root);
    }

    public Color getPencolor() {
        return pencolor;
    }

    public void setPencolor(Color pencolor) {
        this.pencolor = pencolor;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }
}
