package com.loveuba.tryoneapplication.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = TryOneApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface TryOneApplication_GeneratedInjector {
  void injectTryOneApplication(TryOneApplication tryOneApplication);
}
