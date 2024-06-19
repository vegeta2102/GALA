There are 4 Scope define in Pairs
- SessionScope ( Apply for UseCase, Repository or Fragment?)
- EnvironmentScope ( Usage : App Starting class or DB)
- ServiceScope ( Usage: Service or Broadcast class)
- AppScope ( Apply for app class ?)


UserBrowseStateRepository
SessionStore.kt  アプリデーター on memory かんり
参照されない状態を作らないと移動できない。

SessionState
DomainState

LoggedInStated (11 -> 15)


 libc                    jp.eure.android.pairs                A  Fatal signal 11 (SIGSEGV), code 2 (SEGV_ACCERR), fault addr 0x7a4980b2e39e in tid 24316 (e.android.pairs), pid 24316 (e.android.pairs)


 Fatal signal 11 (SIGSEGV), code 2 (SEGV_ACCERR), fault addr 0x7a48e4380418 in tid 25425 (HceCallEngine), pid 25071 (e.android.pairs)