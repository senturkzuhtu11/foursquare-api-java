/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Lepp� / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 2.1 or later (the "LGPL") 
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Category extends FoursquareEntity {
  
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getIcon() {
    return icon;
  }

  public String[] getParents() {
    return parents;
  }

  public Boolean getPrimary() {
    return primary;
  }
  
  public Category[] getCategories() {
    return categories;
  }

  private String id;
  private String name;
  private String icon;
  private String[] parents;
  private Boolean primary;
  private Category[] categories;
}