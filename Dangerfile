# Android Lint
android_lint.skip_gradle_task = true
android_lint.filtering = true
Dir["*/build/reports/lint-results*.xml"].each do |file|
  android_lint.report_file = file
  android_lint.lint(inline_mode: true)
end
