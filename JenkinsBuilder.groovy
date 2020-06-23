@Library('CommonLib@feature/tags') _
def common = new com.lib.JenkinsCommonDockerBuildPipeline()
common.runPipeline()
