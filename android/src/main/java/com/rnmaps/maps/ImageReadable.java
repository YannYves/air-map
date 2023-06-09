package com.rnmaps.maps;


import android.graphics.Bitmap;

import com.google.android.gms.maps.model.BitmapDescriptor;

public interface ImageReadable {

  public void setIconBitmap(Bitmap bitmap);

  public void setIconBitmapDescriptor(BitmapDescriptor bitmapDescriptor);

  public void update();
}
