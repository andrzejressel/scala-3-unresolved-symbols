Works with 3.1.3-RC4

On 3.1.3-RC5 throws

```
[error] ## Exception when compiling 1 sources to XXXXXX\target\scala-3.1.3-RC5\classes
[error] java.lang.AssertionError: assertion failed: unresolved symbols: parameter to (line 13) #16698 when pickling XXXXXX\src\main\scala\Main.scala
[error] scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
[error] dotty.tools.dotc.core.tasty.TreePickler.pickle(TreePickler.scala:776)
[error] dotty.tools.dotc.transform.Pickler.run$$anonfun$1$$anonfun$1(Pickler.scala:72)
[error] scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error] scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error] scala.collection.immutable.List.foreach(List.scala:333)
[error] dotty.tools.dotc.transform.Pickler.run$$anonfun$1(Pickler.scala:109)
[error] scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error] scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error] scala.collection.immutable.List.foreach(List.scala:333)
[error] dotty.tools.dotc.transform.Pickler.run(Pickler.scala:109)
[error] dotty.tools.dotc.core.Phases$Phase.runOn$$anonfun$1(Phases.scala:311)
[error] scala.collection.immutable.List.map(List.scala:246)
[error] dotty.tools.dotc.core.Phases$Phase.runOn(Phases.scala:312)
[error] dotty.tools.dotc.transform.Pickler.runOn(Pickler.scala:114)
[error] dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:225)
[error] scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error] scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error] scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1328)
[error] dotty.tools.dotc.Run.runPhases$1(Run.scala:236)
[error] dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:244)
[error] dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:253)
[error] dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:68)
[error] dotty.tools.dotc.Run.compileUnits(Run.scala:253)
[error] dotty.tools.dotc.Run.compileSources(Run.scala:186)
[error] dotty.tools.dotc.Run.compile(Run.scala:170)
[error] dotty.tools.dotc.Driver.doCompile(Driver.scala:35)
[error] dotty.tools.xsbt.CompilerBridgeDriver.run(CompilerBridgeDriver.java:88)
[error] dotty.tools.xsbt.CompilerBridge.run(CompilerBridge.java:22)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:91)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$7(MixedAnalyzingCompiler.scala:192)
[error] scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error] sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:247)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:182)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4$adapted(MixedAnalyzingCompiler.scala:163)
[error] sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:239)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:163)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:210)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:528)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:528)
[error] sbt.internal.inc.Incremental$.$anonfun$apply$5(Incremental.scala:177)
[error] sbt.internal.inc.Incremental$.$anonfun$apply$5$adapted(Incremental.scala:175)
[error] sbt.internal.inc.Incremental$$anon$2.run(Incremental.scala:461)
[error] sbt.internal.inc.IncrementalCommon$CycleState.next(IncrementalCommon.scala:116)
[error] sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:56)
[error] sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:52)
[error] sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:263)
[error] sbt.internal.inc.Incremental$.$anonfun$incrementalCompile$8(Incremental.scala:416)
[error] sbt.internal.inc.Incremental$.withClassfileManager(Incremental.scala:503)
[error] sbt.internal.inc.Incremental$.incrementalCompile(Incremental.scala:403)
[error] sbt.internal.inc.Incremental$.apply(Incremental.scala:169)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:528)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:482)
[error] sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:332)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:420)
[error] sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:137)
[error] sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:2366)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$2(Defaults.scala:2316)
[error] sbt.internal.server.BspCompileTask$.$anonfun$compute$1(BspCompileTask.scala:30)
[error] sbt.internal.io.Retry$.apply(Retry.scala:46)
[error] sbt.internal.io.Retry$.apply(Retry.scala:28)
[error] sbt.internal.io.Retry$.apply(Retry.scala:23)
[error] sbt.internal.server.BspCompileTask$.compute(BspCompileTask.scala:30)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:2314)
[error] scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error] sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error] sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error] sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error] sbt.Execute.work(Execute.scala:291)
[error] sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error] sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error] sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error] java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
[error] java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] java.base/java.lang.Thread.run(Thread.java:829)
[error]
[error] java.lang.AssertionError: assertion failed: unresolved symbols: parameter to (line 13) #16698 when pickling XXXXXX\src\main\scala\Main.scala
[error]         at scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
[error]         at dotty.tools.dotc.core.tasty.TreePickler.pickle(TreePickler.scala:776)
[error]         at dotty.tools.dotc.transform.Pickler.run$$anonfun$1$$anonfun$1(Pickler.scala:72)
[error]         at scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error]         at scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error]         at scala.collection.immutable.List.foreach(List.scala:333)
[error]         at dotty.tools.dotc.transform.Pickler.run$$anonfun$1(Pickler.scala:109)
[error]         at scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error]         at scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error]         at scala.collection.immutable.List.foreach(List.scala:333)
[error]         at dotty.tools.dotc.transform.Pickler.run(Pickler.scala:109)
[error]         at dotty.tools.dotc.core.Phases$Phase.runOn$$anonfun$1(Phases.scala:311)
[error]         at scala.collection.immutable.List.map(List.scala:246)
[error]         at dotty.tools.dotc.core.Phases$Phase.runOn(Phases.scala:312)
[error]         at dotty.tools.dotc.transform.Pickler.runOn(Pickler.scala:114)
[error]         at dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:225)
[error]         at scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error]         at scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error]         at scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1328)
[error]         at dotty.tools.dotc.Run.runPhases$1(Run.scala:236)
[error]         at dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:244)
[error]         at dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:253)
[error]         at dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:68)
[error]         at dotty.tools.dotc.Run.compileUnits(Run.scala:253)
[error]         at dotty.tools.dotc.Run.compileSources(Run.scala:186)
[error]         at dotty.tools.dotc.Run.compile(Run.scala:170)
[error]         at dotty.tools.dotc.Driver.doCompile(Driver.scala:35)
[error]         at dotty.tools.xsbt.CompilerBridgeDriver.run(CompilerBridgeDriver.java:88)
[error]         at dotty.tools.xsbt.CompilerBridge.run(CompilerBridge.java:22)
[error]         at sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:91)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$7(MixedAnalyzingCompiler.scala:192)
[error]         at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:247)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:182)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4$adapted(MixedAnalyzingCompiler.scala:163)
[error]         at sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:239)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:163)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:210)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:528)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:528)
[error]         at sbt.internal.inc.Incremental$.$anonfun$apply$5(Incremental.scala:177)
[error]         at sbt.internal.inc.Incremental$.$anonfun$apply$5$adapted(Incremental.scala:175)
[error]         at sbt.internal.inc.Incremental$$anon$2.run(Incremental.scala:461)
[error]         at sbt.internal.inc.IncrementalCommon$CycleState.next(IncrementalCommon.scala:116)
[error]         at sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:56)
[error]         at sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:52)
[error]         at sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:263)
[error]         at sbt.internal.inc.Incremental$.$anonfun$incrementalCompile$8(Incremental.scala:416)
[error]         at sbt.internal.inc.Incremental$.withClassfileManager(Incremental.scala:503)
[error]         at sbt.internal.inc.Incremental$.incrementalCompile(Incremental.scala:403)
[error]         at sbt.internal.inc.Incremental$.apply(Incremental.scala:169)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:528)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:482)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:332)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:420)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:137)
[error]         at sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:2366)
[error]         at sbt.Defaults$.$anonfun$compileIncrementalTask$2(Defaults.scala:2316)
[error]         at sbt.internal.server.BspCompileTask$.$anonfun$compute$1(BspCompileTask.scala:30)
[error]         at sbt.internal.io.Retry$.apply(Retry.scala:46)
[error]         at sbt.internal.io.Retry$.apply(Retry.scala:28)
[error]         at sbt.internal.io.Retry$.apply(Retry.scala:23)
[error]         at sbt.internal.server.BspCompileTask$.compute(BspCompileTask.scala:30)
[error]         at sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:2314)
[error]         at scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error]         at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error]         at sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error]         at sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error]         at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error]         at sbt.Execute.work(Execute.scala:291)
[error]         at sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error]         at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error]         at sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error]         at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error]         at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
[error]         at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error]         at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error]         at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error]         at java.base/java.lang.Thread.run(Thread.java:829)
[error] (Compile / compileIncremental) java.lang.AssertionError: assertion failed: unresolved symbols: parameter to (line 13) #16698 when pickling XXXXXX\src\main\scala\Main.scala
```
