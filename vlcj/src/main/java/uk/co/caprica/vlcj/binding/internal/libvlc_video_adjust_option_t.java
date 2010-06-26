/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.binding.internal;

public enum libvlc_video_adjust_option_t {
  
  libvlc_adjust_Enable    (0),
  libvlc_adjust_Contrast  (1),
  libvlc_adjust_Brightness(2),
  libvlc_adjust_Hue       (3),
  libvlc_adjust_Saturation(4),
  libvlc_adjust_Gamma     (5);

  private final int intValue;
  
  private libvlc_video_adjust_option_t(int intValue) {
    this.intValue = intValue;
  }
  
  public int intValue() {
    return intValue;
  }
}
