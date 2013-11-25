mvntestng
=========

Test maven surefire plugin 2.16 to TestNG listeners


surefire 2.16 output

Configuring TestNG with: TestNG652Configurator
Constructor called on Instance org.test.TestngListener@45f8d1f2
Constructor called on Instance org.test.TestngListener@28b3cf4a  <------!!!!!------
Instance org.test.TestngListener@45f8d1f2 onStart
Instance org.test.TestngListener@45f8d1f2 onTestStart
Instance org.test.TestngListener@45f8d1f2 beforeInvocation NewTest.newTest1()[pri:0, instance:org.test.NewTest@16011db4] 369171892
Instance org.test.TestngListener@28b3cf4a beforeInvocation NewTest.newTest1()[pri:0, instance:org.test.NewTest@16011db4] 369171892
newTest1
Instance org.test.TestngListener@45f8d1f2 afterInvocationNewTest.newTest1()[pri:0, instance:org.test.NewTest@16011db4] 369171892
Instance org.test.TestngListener@28b3cf4a afterInvocationNewTest.newTest1()[pri:0, instance:org.test.NewTest@16011db4] 369171892
Instance org.test.TestngListener@45f8d1f2 onTestSuccess
Instance org.test.TestngListener@45f8d1f2 onTestStart
Instance org.test.TestngListener@45f8d1f2 beforeInvocation NewTest.newTest2()[pri:0, instance:org.test.NewTest@16011db4] 369171892
Instance org.test.TestngListener@28b3cf4a beforeInvocation NewTest.newTest2()[pri:0, instance:org.test.NewTest@16011db4] 369171892
newTest2
Instance org.test.TestngListener@45f8d1f2 afterInvocationNewTest.newTest2()[pri:0, instance:org.test.NewTest@16011db4] 369171892
Instance org.test.TestngListener@28b3cf4a afterInvocationNewTest.newTest2()[pri:0, instance:org.test.NewTest@16011db4] 369171892
Instance org.test.TestngListener@45f8d1f2 onTestSuccess
Instance org.test.TestngListener@45f8d1f2 onFinish
Instance org.test.TestngListener@28b3cf4a onStart
Instance org.test.TestngListener@28b3cf4a onTestStart
Instance org.test.TestngListener@45f8d1f2 beforeInvocation AppTest.testApp()[pri:0, instance:org.test.AppTest@29557211] 693465617
Instance org.test.TestngListener@28b3cf4a beforeInvocation AppTest.testApp()[pri:0, instance:org.test.AppTest@29557211] 693465617
testApp
Instance org.test.TestngListener@45f8d1f2 afterInvocationAppTest.testApp()[pri:0, instance:org.test.AppTest@29557211] 693465617
Instance org.test.TestngListener@28b3cf4a afterInvocationAppTest.testApp()[pri:0, instance:org.test.AppTest@29557211] 693465617
Instance org.test.TestngListener@28b3cf4a onTestSuccess
Instance org.test.TestngListener@28b3cf4a onTestStart
Instance org.test.TestngListener@45f8d1f2 beforeInvocation AppTest.testApp2()[pri:0, instance:org.test.AppTest@29557211] 693465617
Instance org.test.TestngListener@28b3cf4a beforeInvocation AppTest.testApp2()[pri:0, instance:org.test.AppTest@29557211] 693465617
testApp2
Instance org.test.TestngListener@45f8d1f2 afterInvocationAppTest.testApp2()[pri:0, instance:org.test.AppTest@29557211] 693465617
Instance org.test.TestngListener@28b3cf4a afterInvocationAppTest.testApp2()[pri:0, instance:org.test.AppTest@29557211] 693465617
Instance org.test.TestngListener@28b3cf4a onTestSuccess
Instance org.test.TestngListener@28b3cf4a onFinish


surefire 2.15 output

Running TestSuite
Configuring TestNG with: TestNG652Configurator
Constructor called on Instance org.test.TestngListener@6f86e8cb
Instance org.test.TestngListener@6f86e8cb onStart
Instance org.test.TestngListener@6f86e8cb onTestStart
Instance org.test.TestngListener@6f86e8cb beforeInvocation AppTest.testApp()[pri:0, instance:org.test.AppTest@6d116cae] 1829858478
testApp
Instance org.test.TestngListener@6f86e8cb afterInvocationAppTest.testApp()[pri:0, instance:org.test.AppTest@6d116cae] 1829858478
Instance org.test.TestngListener@6f86e8cb onTestSuccess
Instance org.test.TestngListener@6f86e8cb onTestStart
Instance org.test.TestngListener@6f86e8cb beforeInvocation AppTest.testApp2()[pri:0, instance:org.test.AppTest@6d116cae] 1829858478
testApp2
Instance org.test.TestngListener@6f86e8cb afterInvocationAppTest.testApp2()[pri:0, instance:org.test.AppTest@6d116cae] 1829858478
Instance org.test.TestngListener@6f86e8cb onTestSuccess
Instance org.test.TestngListener@6f86e8cb onTestStart
Instance org.test.TestngListener@6f86e8cb beforeInvocation NewTest.newTest1()[pri:0, instance:org.test.NewTest@654355f1] 1698911729
newTest1
Instance org.test.TestngListener@6f86e8cb afterInvocationNewTest.newTest1()[pri:0, instance:org.test.NewTest@654355f1] 1698911729
Instance org.test.TestngListener@6f86e8cb onTestSuccess
Instance org.test.TestngListener@6f86e8cb onTestStart
Instance org.test.TestngListener@6f86e8cb beforeInvocation NewTest.newTest2()[pri:0, instance:org.test.NewTest@654355f1] 1698911729
newTest2
Instance org.test.TestngListener@6f86e8cb afterInvocationNewTest.newTest2()[pri:0, instance:org.test.NewTest@654355f1] 1698911729
Instance org.test.TestngListener@6f86e8cb onTestSuccess
Instance org.test.TestngListener@6f86e8cb onFinish




