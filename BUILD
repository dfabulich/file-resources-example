java_library(
	name='app',
	srcs=glob(['src/main/java/**/*.java']),
)

java_test(
	name='test',
	srcs=glob(['src/test/java/**/*.java']),
	resources=glob(['src/test/resources/**/*']),
	deps=['app', '@junit//jar', '@hamcrest_core//jar'],
)