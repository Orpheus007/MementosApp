// Generated by data binding compiler. Do not edit!
package com.gpg.mementos.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;
import com.gpg.mementos.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class QrScreenBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageButton appCompatImageButton;

  @NonNull
  public final CircularRevealFrameLayout contentFrame;

  @NonNull
  public final AppCompatCheckBox flashLightCheckbox;

  protected QrScreenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageButton appCompatImageButton, CircularRevealFrameLayout contentFrame,
      AppCompatCheckBox flashLightCheckbox) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatImageButton = appCompatImageButton;
    this.contentFrame = contentFrame;
    this.flashLightCheckbox = flashLightCheckbox;
  }

  @NonNull
  public static QrScreenBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.qr_screen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static QrScreenBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<QrScreenBinding>inflateInternal(inflater, R.layout.qr_screen, root, attachToRoot, component);
  }

  @NonNull
  public static QrScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.qr_screen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static QrScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<QrScreenBinding>inflateInternal(inflater, R.layout.qr_screen, null, false, component);
  }

  public static QrScreenBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static QrScreenBinding bind(@NonNull View view, @Nullable Object component) {
    return (QrScreenBinding)bind(component, view, R.layout.qr_screen);
  }
}
