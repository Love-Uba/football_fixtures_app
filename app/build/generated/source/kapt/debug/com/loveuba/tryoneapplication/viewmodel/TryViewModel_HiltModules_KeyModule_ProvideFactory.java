// Generated by Dagger (https://dagger.dev).
package com.loveuba.tryoneapplication.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static TryViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(TryViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final TryViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TryViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
