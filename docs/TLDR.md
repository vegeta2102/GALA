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