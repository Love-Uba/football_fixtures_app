// Generated by Dagger (https://dagger.dev).
package com.loveuba.tryoneapplication.di;

import com.loveuba.tryoneapplication.data.TryService;
import com.loveuba.tryoneapplication.data.repo.ITryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TryOneModule_ProvideTryRepositoryFactory implements Factory<ITryRepository> {
  private final Provider<TryService> tryServiceProvider;

  public TryOneModule_ProvideTryRepositoryFactory(Provider<TryService> tryServiceProvider) {
    this.tryServiceProvider = tryServiceProvider;
  }

  @Override
  public ITryRepository get() {
    return provideTryRepository(tryServiceProvider.get());
  }

  public static TryOneModule_ProvideTryRepositoryFactory create(
      Provider<TryService> tryServiceProvider) {
    return new TryOneModule_ProvideTryRepositoryFactory(tryServiceProvider);
  }

  public static ITryRepository provideTryRepository(TryService tryService) {
    return Preconditions.checkNotNullFromProvides(TryOneModule.INSTANCE.provideTryRepository(tryService));
  }
}
