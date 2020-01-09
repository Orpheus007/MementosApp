// Generated by Dagger (https://dagger.dev).
package com.gpg.mementos.helperClasses;

import androidx.lifecycle.ViewModel;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModelFactory_Factory<VM extends ViewModel> implements Factory<ViewModelFactory<VM>> {
  private final Provider<VM> viewModelProvider;

  public ViewModelFactory_Factory(Provider<VM> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ViewModelFactory<VM> get() {
    return newInstance(DoubleCheck.lazy(viewModelProvider));
  }

  public static <VM extends ViewModel> ViewModelFactory_Factory<VM> create(
      Provider<VM> viewModelProvider) {
    return new ViewModelFactory_Factory<VM>(viewModelProvider);
  }

  public static <VM extends ViewModel> ViewModelFactory<VM> newInstance(Lazy<VM> viewModel) {
    return new ViewModelFactory<VM>(viewModel);
  }
}
