package org.xtext.urdf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.urdf.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'", "'RobotName'", "'Link'", "'Joint'", "'Origin'", "'Mass'", "'Inertia'", "'Color'", "'Texture'", "'Box'", "'Cylinder'", "'Mesh'", "'Sphere'", "'Limit'", "'Axis'", "'x'", "'y'", "'z'", "'Calibration'", "'Rising'", "'Falling'", "'Dynamics'", "'Friction'", "'Damping'", "'Mimic'", "'Multiplier'", "'OffSet'", "'SafetyController'", "'SoftLowerLimit'", "'SoftUpperLimit'", "'k_position'", "'k_velocity'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobot"
    // InternalDsl.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleRobot EOF )
            // InternalDsl.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalDsl.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Robot__Group__0 )
            // InternalDsl.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMaterial"
    // InternalDsl.g:78:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleMaterial EOF )
            // InternalDsl.g:80:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDsl.g:87:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Material__Alternatives )
            // InternalDsl.g:94:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:103:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleGeometry EOF )
            // InternalDsl.g:105:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalDsl.g:112:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__Geometry__Alternatives )
            // InternalDsl.g:119:4: rule__Geometry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:128:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleLink EOF )
            // InternalDsl.g:130:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:137:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Link__Group__0 )
            // InternalDsl.g:144:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:153:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleJoint EOF )
            // InternalDsl.g:155:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalDsl.g:162:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Joint__Group__0 )
            // InternalDsl.g:169:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:178:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleInertial EOF )
            // InternalDsl.g:180:1: ruleInertial EOF
            {
             before(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getInertialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalDsl.g:187:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Inertial__Group__0 )
            // InternalDsl.g:194:4: rule__Inertial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:203:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleVisual EOF )
            // InternalDsl.g:205:1: ruleVisual EOF
            {
             before(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getVisualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalDsl.g:212:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Visual__Group__0 )
            // InternalDsl.g:219:4: rule__Visual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:228:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleCollision EOF )
            // InternalDsl.g:230:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalDsl.g:237:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Collision__Group__0 )
            // InternalDsl.g:244:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:253:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleOrigin EOF )
            // InternalDsl.g:255:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalDsl.g:262:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Origin__Group__0 )
            // InternalDsl.g:269:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:278:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleMass EOF )
            // InternalDsl.g:280:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalDsl.g:287:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Mass__Group__0 )
            // InternalDsl.g:294:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:303:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleInertia EOF )
            // InternalDsl.g:305:1: ruleInertia EOF
            {
             before(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalDsl.g:312:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Inertia__Group__0 )
            // InternalDsl.g:319:4: rule__Inertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:328:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleColor EOF )
            // InternalDsl.g:330:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDsl.g:337:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Color__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Color__Group__0 )
            // InternalDsl.g:344:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:353:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleTexture EOF )
            // InternalDsl.g:355:1: ruleTexture EOF
            {
             before(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            ruleTexture();

            state._fsp--;

             after(grammarAccess.getTextureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalDsl.g:362:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__Texture__Group__0 )
            // InternalDsl.g:369:4: rule__Texture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:378:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleBox EOF )
            // InternalDsl.g:380:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalDsl.g:387:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Box__Group__0 )
            // InternalDsl.g:394:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:403:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleCylinder EOF )
            // InternalDsl.g:405:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalDsl.g:412:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__Cylinder__Group__0 )
            // InternalDsl.g:419:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:428:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleMesh EOF )
            // InternalDsl.g:430:1: ruleMesh EOF
            {
             before(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getMeshRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalDsl.g:437:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Mesh__Group__0 )
            // InternalDsl.g:444:4: rule__Mesh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:453:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleSphere EOF )
            // InternalDsl.g:455:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalDsl.g:462:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Sphere__Group__0 )
            // InternalDsl.g:469:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:478:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleLimit EOF )
            // InternalDsl.g:480:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDsl.g:487:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__Limit__Group__0 )
            // InternalDsl.g:494:4: rule__Limit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:503:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleAxis EOF )
            // InternalDsl.g:505:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalDsl.g:512:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Axis__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Axis__Group__0 )
            // InternalDsl.g:519:4: rule__Axis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:528:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleCalibration EOF )
            // InternalDsl.g:530:1: ruleCalibration EOF
            {
             before(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getCalibrationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalDsl.g:537:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__Calibration__Group__0 )
            // InternalDsl.g:544:4: rule__Calibration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:553:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleDynamics EOF )
            // InternalDsl.g:555:1: ruleDynamics EOF
            {
             before(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getDynamicsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalDsl.g:562:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__Dynamics__Group__0 )
            // InternalDsl.g:569:4: rule__Dynamics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:578:1: entryRuleMimic : ruleMimic EOF ;
    public final void entryRuleMimic() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleMimic EOF )
            // InternalDsl.g:580:1: ruleMimic EOF
            {
             before(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getMimicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalDsl.g:587:1: ruleMimic : ( ( rule__Mimic__Group__0 ) ) ;
    public final void ruleMimic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__Mimic__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__Mimic__Group__0 )
            {
             before(grammarAccess.getMimicAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__Mimic__Group__0 )
            // InternalDsl.g:594:4: rule__Mimic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:603:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleSafetyController EOF )
            // InternalDsl.g:605:1: ruleSafetyController EOF
            {
             before(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getSafetyControllerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalDsl.g:612:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__SafetyController__Group__0 )
            // InternalDsl.g:619:4: rule__SafetyController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:628:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleFLOAT EOF )
            // InternalDsl.g:630:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:637:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__FLOAT__Group__0 )
            // InternalDsl.g:644:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:653:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:657:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalDsl.g:658:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalDsl.g:658:2: ( ( rule__JointType__Alternatives ) )
            // InternalDsl.g:659:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalDsl.g:660:3: ( rule__JointType__Alternatives )
            // InternalDsl.g:660:4: rule__JointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointType"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalDsl.g:668:1: rule__Material__Alternatives : ( ( ruleColor ) | ( ruleTexture ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:672:1: ( ( ruleColor ) | ( ruleTexture ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:673:2: ( ruleColor )
                    {
                    // InternalDsl.g:673:2: ( ruleColor )
                    // InternalDsl.g:674:3: ruleColor
                    {
                     before(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:679:2: ( ruleTexture )
                    {
                    // InternalDsl.g:679:2: ( ruleTexture )
                    // InternalDsl.g:680:3: ruleTexture
                    {
                     before(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTexture();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__Geometry__Alternatives"
    // InternalDsl.g:689:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:693:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:694:2: ( ruleBox )
                    {
                    // InternalDsl.g:694:2: ( ruleBox )
                    // InternalDsl.g:695:3: ruleBox
                    {
                     before(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:700:2: ( ruleCylinder )
                    {
                    // InternalDsl.g:700:2: ( ruleCylinder )
                    // InternalDsl.g:701:3: ruleCylinder
                    {
                     before(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinder();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:706:2: ( ruleMesh )
                    {
                    // InternalDsl.g:706:2: ( ruleMesh )
                    // InternalDsl.g:707:3: ruleMesh
                    {
                     before(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMesh();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:712:2: ( ruleSphere )
                    {
                    // InternalDsl.g:712:2: ( ruleSphere )
                    // InternalDsl.g:713:3: ruleSphere
                    {
                     before(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Alternatives"


    // $ANTLR start "rule__JointType__Alternatives"
    // InternalDsl.g:722:1: rule__JointType__Alternatives : ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:726:1: ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:727:2: ( ( 'Revolute' ) )
                    {
                    // InternalDsl.g:727:2: ( ( 'Revolute' ) )
                    // InternalDsl.g:728:3: ( 'Revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:729:3: ( 'Revolute' )
                    // InternalDsl.g:729:4: 'Revolute'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:733:2: ( ( 'Continous' ) )
                    {
                    // InternalDsl.g:733:2: ( ( 'Continous' ) )
                    // InternalDsl.g:734:3: ( 'Continous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:735:3: ( 'Continous' )
                    // InternalDsl.g:735:4: 'Continous'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:739:2: ( ( 'Fixed' ) )
                    {
                    // InternalDsl.g:739:2: ( ( 'Fixed' ) )
                    // InternalDsl.g:740:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:741:3: ( 'Fixed' )
                    // InternalDsl.g:741:4: 'Fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:745:2: ( ( 'Prismatic' ) )
                    {
                    // InternalDsl.g:745:2: ( ( 'Prismatic' ) )
                    // InternalDsl.g:746:3: ( 'Prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:747:3: ( 'Prismatic' )
                    // InternalDsl.g:747:4: 'Prismatic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointType__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalDsl.g:755:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalDsl.g:760:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalDsl.g:767:1: rule__Robot__Group__0__Impl : ( 'RobotName' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:771:1: ( ( 'RobotName' ) )
            // InternalDsl.g:772:1: ( 'RobotName' )
            {
            // InternalDsl.g:772:1: ( 'RobotName' )
            // InternalDsl.g:773:2: 'RobotName'
            {
             before(grammarAccess.getRobotAccess().getRobotNameKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalDsl.g:782:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalDsl.g:787:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalDsl.g:794:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalDsl.g:799:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalDsl.g:799:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalDsl.g:800:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalDsl.g:801:2: ( rule__Robot__NameAssignment_1 )
            // InternalDsl.g:801:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalDsl.g:809:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:813:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalDsl.g:814:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalDsl.g:821:1: rule__Robot__Group__2__Impl : ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:825:1: ( ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) ) )
            // InternalDsl.g:826:1: ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) )
            {
            // InternalDsl.g:826:1: ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) )
            // InternalDsl.g:827:2: ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* )
            {
            // InternalDsl.g:827:2: ( ( rule__Robot__LinkAssignment_2 ) )
            // InternalDsl.g:828:3: ( rule__Robot__LinkAssignment_2 )
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_2()); 
            // InternalDsl.g:829:3: ( rule__Robot__LinkAssignment_2 )
            // InternalDsl.g:829:4: rule__Robot__LinkAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Robot__LinkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getLinkAssignment_2()); 

            }

            // InternalDsl.g:832:2: ( ( rule__Robot__LinkAssignment_2 )* )
            // InternalDsl.g:833:3: ( rule__Robot__LinkAssignment_2 )*
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_2()); 
            // InternalDsl.g:834:3: ( rule__Robot__LinkAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:834:4: rule__Robot__LinkAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Robot__LinkAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getLinkAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalDsl.g:843:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:847:1: ( rule__Robot__Group__3__Impl )
            // InternalDsl.g:848:2: rule__Robot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalDsl.g:854:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__JointAssignment_3 )* ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:858:1: ( ( ( rule__Robot__JointAssignment_3 )* ) )
            // InternalDsl.g:859:1: ( ( rule__Robot__JointAssignment_3 )* )
            {
            // InternalDsl.g:859:1: ( ( rule__Robot__JointAssignment_3 )* )
            // InternalDsl.g:860:2: ( rule__Robot__JointAssignment_3 )*
            {
             before(grammarAccess.getRobotAccess().getJointAssignment_3()); 
            // InternalDsl.g:861:2: ( rule__Robot__JointAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:861:3: rule__Robot__JointAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Robot__JointAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getJointAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalDsl.g:870:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalDsl.g:875:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalDsl.g:882:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:886:1: ( ( () ) )
            // InternalDsl.g:887:1: ( () )
            {
            // InternalDsl.g:887:1: ( () )
            // InternalDsl.g:888:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalDsl.g:889:2: ()
            // InternalDsl.g:889:3: 
            {
            }

             after(grammarAccess.getLinkAccess().getLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalDsl.g:897:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:901:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalDsl.g:902:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalDsl.g:909:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( ( 'Link' ) )
            // InternalDsl.g:914:1: ( 'Link' )
            {
            // InternalDsl.g:914:1: ( 'Link' )
            // InternalDsl.g:915:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalDsl.g:924:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalDsl.g:929:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalDsl.g:936:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:940:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalDsl.g:941:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalDsl.g:941:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalDsl.g:942:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalDsl.g:943:2: ( rule__Link__NameAssignment_2 )
            // InternalDsl.g:943:3: rule__Link__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalDsl.g:951:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:955:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalDsl.g:956:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalDsl.g:963:1: rule__Link__Group__3__Impl : ( ( rule__Link__InertialAssignment_3 )* ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( ( ( rule__Link__InertialAssignment_3 )* ) )
            // InternalDsl.g:968:1: ( ( rule__Link__InertialAssignment_3 )* )
            {
            // InternalDsl.g:968:1: ( ( rule__Link__InertialAssignment_3 )* )
            // InternalDsl.g:969:2: ( rule__Link__InertialAssignment_3 )*
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_3()); 
            // InternalDsl.g:970:2: ( rule__Link__InertialAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:970:3: rule__Link__InertialAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Link__InertialAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getInertialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalDsl.g:978:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:982:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalDsl.g:983:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalDsl.g:990:1: rule__Link__Group__4__Impl : ( ( rule__Link__VisualsAssignment_4 )* ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:994:1: ( ( ( rule__Link__VisualsAssignment_4 )* ) )
            // InternalDsl.g:995:1: ( ( rule__Link__VisualsAssignment_4 )* )
            {
            // InternalDsl.g:995:1: ( ( rule__Link__VisualsAssignment_4 )* )
            // InternalDsl.g:996:2: ( rule__Link__VisualsAssignment_4 )*
            {
             before(grammarAccess.getLinkAccess().getVisualsAssignment_4()); 
            // InternalDsl.g:997:2: ( rule__Link__VisualsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||(LA7_0>=21 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:997:3: rule__Link__VisualsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Link__VisualsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getVisualsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalDsl.g:1005:1: rule__Link__Group__5 : rule__Link__Group__5__Impl ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1009:1: ( rule__Link__Group__5__Impl )
            // InternalDsl.g:1010:2: rule__Link__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalDsl.g:1016:1: rule__Link__Group__5__Impl : ( ( rule__Link__CollisionAssignment_5 )* ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1020:1: ( ( ( rule__Link__CollisionAssignment_5 )* ) )
            // InternalDsl.g:1021:1: ( ( rule__Link__CollisionAssignment_5 )* )
            {
            // InternalDsl.g:1021:1: ( ( rule__Link__CollisionAssignment_5 )* )
            // InternalDsl.g:1022:2: ( rule__Link__CollisionAssignment_5 )*
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_5()); 
            // InternalDsl.g:1023:2: ( rule__Link__CollisionAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=23 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1023:3: rule__Link__CollisionAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Link__CollisionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getCollisionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalDsl.g:1032:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1036:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalDsl.g:1037:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalDsl.g:1044:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( ( 'Joint' ) )
            // InternalDsl.g:1049:1: ( 'Joint' )
            {
            // InternalDsl.g:1049:1: ( 'Joint' )
            // InternalDsl.g:1050:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalDsl.g:1059:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1063:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalDsl.g:1064:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalDsl.g:1071:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalDsl.g:1076:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalDsl.g:1076:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalDsl.g:1077:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalDsl.g:1078:2: ( rule__Joint__NameAssignment_1 )
            // InternalDsl.g:1078:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalDsl.g:1086:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1090:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalDsl.g:1091:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalDsl.g:1098:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__TypeAssignment_2 ) ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1102:1: ( ( ( rule__Joint__TypeAssignment_2 ) ) )
            // InternalDsl.g:1103:1: ( ( rule__Joint__TypeAssignment_2 ) )
            {
            // InternalDsl.g:1103:1: ( ( rule__Joint__TypeAssignment_2 ) )
            // InternalDsl.g:1104:2: ( rule__Joint__TypeAssignment_2 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_2()); 
            // InternalDsl.g:1105:2: ( rule__Joint__TypeAssignment_2 )
            // InternalDsl.g:1105:3: rule__Joint__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // InternalDsl.g:1113:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1117:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalDsl.g:1118:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalDsl.g:1125:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__ChildOfAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( ( ( rule__Joint__ChildOfAssignment_3 ) ) )
            // InternalDsl.g:1130:1: ( ( rule__Joint__ChildOfAssignment_3 ) )
            {
            // InternalDsl.g:1130:1: ( ( rule__Joint__ChildOfAssignment_3 ) )
            // InternalDsl.g:1131:2: ( rule__Joint__ChildOfAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_3()); 
            // InternalDsl.g:1132:2: ( rule__Joint__ChildOfAssignment_3 )
            // InternalDsl.g:1132:3: rule__Joint__ChildOfAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalDsl.g:1140:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1144:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalDsl.g:1145:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalDsl.g:1152:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__ParentOfAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1156:1: ( ( ( rule__Joint__ParentOfAssignment_4 ) ) )
            // InternalDsl.g:1157:1: ( ( rule__Joint__ParentOfAssignment_4 ) )
            {
            // InternalDsl.g:1157:1: ( ( rule__Joint__ParentOfAssignment_4 ) )
            // InternalDsl.g:1158:2: ( rule__Joint__ParentOfAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_4()); 
            // InternalDsl.g:1159:2: ( rule__Joint__ParentOfAssignment_4 )
            // InternalDsl.g:1159:3: rule__Joint__ParentOfAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalDsl.g:1167:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1171:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalDsl.g:1172:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalDsl.g:1179:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__LimitAssignment_5 )? ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( ( ( rule__Joint__LimitAssignment_5 )? ) )
            // InternalDsl.g:1184:1: ( ( rule__Joint__LimitAssignment_5 )? )
            {
            // InternalDsl.g:1184:1: ( ( rule__Joint__LimitAssignment_5 )? )
            // InternalDsl.g:1185:2: ( rule__Joint__LimitAssignment_5 )?
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_5()); 
            // InternalDsl.g:1186:2: ( rule__Joint__LimitAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1186:3: rule__Joint__LimitAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__LimitAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getLimitAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalDsl.g:1194:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1198:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalDsl.g:1199:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalDsl.g:1206:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__AxisAssignment_6 )? ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( ( ( rule__Joint__AxisAssignment_6 )? ) )
            // InternalDsl.g:1211:1: ( ( rule__Joint__AxisAssignment_6 )? )
            {
            // InternalDsl.g:1211:1: ( ( rule__Joint__AxisAssignment_6 )? )
            // InternalDsl.g:1212:2: ( rule__Joint__AxisAssignment_6 )?
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_6()); 
            // InternalDsl.g:1213:2: ( rule__Joint__AxisAssignment_6 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1213:3: rule__Joint__AxisAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__AxisAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getAxisAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalDsl.g:1221:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1225:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalDsl.g:1226:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalDsl.g:1233:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__OriginAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1237:1: ( ( ( rule__Joint__OriginAssignment_7 ) ) )
            // InternalDsl.g:1238:1: ( ( rule__Joint__OriginAssignment_7 ) )
            {
            // InternalDsl.g:1238:1: ( ( rule__Joint__OriginAssignment_7 ) )
            // InternalDsl.g:1239:2: ( rule__Joint__OriginAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_7()); 
            // InternalDsl.g:1240:2: ( rule__Joint__OriginAssignment_7 )
            // InternalDsl.g:1240:3: rule__Joint__OriginAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // InternalDsl.g:1248:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1252:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalDsl.g:1253:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalDsl.g:1260:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__CalibrationAssignment_8 )? ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( ( ( rule__Joint__CalibrationAssignment_8 )? ) )
            // InternalDsl.g:1265:1: ( ( rule__Joint__CalibrationAssignment_8 )? )
            {
            // InternalDsl.g:1265:1: ( ( rule__Joint__CalibrationAssignment_8 )? )
            // InternalDsl.g:1266:2: ( rule__Joint__CalibrationAssignment_8 )?
            {
             before(grammarAccess.getJointAccess().getCalibrationAssignment_8()); 
            // InternalDsl.g:1267:2: ( rule__Joint__CalibrationAssignment_8 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1267:3: rule__Joint__CalibrationAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__CalibrationAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getCalibrationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__9"
    // InternalDsl.g:1275:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalDsl.g:1280:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9"


    // $ANTLR start "rule__Joint__Group__9__Impl"
    // InternalDsl.g:1287:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__DynamicsAssignment_9 )? ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1291:1: ( ( ( rule__Joint__DynamicsAssignment_9 )? ) )
            // InternalDsl.g:1292:1: ( ( rule__Joint__DynamicsAssignment_9 )? )
            {
            // InternalDsl.g:1292:1: ( ( rule__Joint__DynamicsAssignment_9 )? )
            // InternalDsl.g:1293:2: ( rule__Joint__DynamicsAssignment_9 )?
            {
             before(grammarAccess.getJointAccess().getDynamicsAssignment_9()); 
            // InternalDsl.g:1294:2: ( rule__Joint__DynamicsAssignment_9 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1294:3: rule__Joint__DynamicsAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__DynamicsAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getDynamicsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__10"
    // InternalDsl.g:1302:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1306:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalDsl.g:1307:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10"


    // $ANTLR start "rule__Joint__Group__10__Impl"
    // InternalDsl.g:1314:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__MimicAssignment_10 )? ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( ( ( rule__Joint__MimicAssignment_10 )? ) )
            // InternalDsl.g:1319:1: ( ( rule__Joint__MimicAssignment_10 )? )
            {
            // InternalDsl.g:1319:1: ( ( rule__Joint__MimicAssignment_10 )? )
            // InternalDsl.g:1320:2: ( rule__Joint__MimicAssignment_10 )?
            {
             before(grammarAccess.getJointAccess().getMimicAssignment_10()); 
            // InternalDsl.g:1321:2: ( rule__Joint__MimicAssignment_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1321:3: rule__Joint__MimicAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__MimicAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getMimicAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10__Impl"


    // $ANTLR start "rule__Joint__Group__11"
    // InternalDsl.g:1329:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1333:1: ( rule__Joint__Group__11__Impl )
            // InternalDsl.g:1334:2: rule__Joint__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11"


    // $ANTLR start "rule__Joint__Group__11__Impl"
    // InternalDsl.g:1340:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__SafetycontrollerAssignment_11 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1344:1: ( ( ( rule__Joint__SafetycontrollerAssignment_11 )? ) )
            // InternalDsl.g:1345:1: ( ( rule__Joint__SafetycontrollerAssignment_11 )? )
            {
            // InternalDsl.g:1345:1: ( ( rule__Joint__SafetycontrollerAssignment_11 )? )
            // InternalDsl.g:1346:2: ( rule__Joint__SafetycontrollerAssignment_11 )?
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_11()); 
            // InternalDsl.g:1347:2: ( rule__Joint__SafetycontrollerAssignment_11 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1347:3: rule__Joint__SafetycontrollerAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__SafetycontrollerAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getSafetycontrollerAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalDsl.g:1356:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1360:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalDsl.g:1361:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Inertial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0"


    // $ANTLR start "rule__Inertial__Group__0__Impl"
    // InternalDsl.g:1368:1: rule__Inertial__Group__0__Impl : ( ( rule__Inertial__OriginAssignment_0 ) ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( ( ( rule__Inertial__OriginAssignment_0 ) ) )
            // InternalDsl.g:1373:1: ( ( rule__Inertial__OriginAssignment_0 ) )
            {
            // InternalDsl.g:1373:1: ( ( rule__Inertial__OriginAssignment_0 ) )
            // InternalDsl.g:1374:2: ( rule__Inertial__OriginAssignment_0 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_0()); 
            // InternalDsl.g:1375:2: ( rule__Inertial__OriginAssignment_0 )
            // InternalDsl.g:1375:3: rule__Inertial__OriginAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__OriginAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getOriginAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0__Impl"


    // $ANTLR start "rule__Inertial__Group__1"
    // InternalDsl.g:1383:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalDsl.g:1388:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Inertial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1"


    // $ANTLR start "rule__Inertial__Group__1__Impl"
    // InternalDsl.g:1395:1: rule__Inertial__Group__1__Impl : ( ( rule__Inertial__MassAssignment_1 ) ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( ( ( rule__Inertial__MassAssignment_1 ) ) )
            // InternalDsl.g:1400:1: ( ( rule__Inertial__MassAssignment_1 ) )
            {
            // InternalDsl.g:1400:1: ( ( rule__Inertial__MassAssignment_1 ) )
            // InternalDsl.g:1401:2: ( rule__Inertial__MassAssignment_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_1()); 
            // InternalDsl.g:1402:2: ( rule__Inertial__MassAssignment_1 )
            // InternalDsl.g:1402:3: rule__Inertial__MassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1__Impl"


    // $ANTLR start "rule__Inertial__Group__2"
    // InternalDsl.g:1410:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( rule__Inertial__Group__2__Impl )
            // InternalDsl.g:1415:2: rule__Inertial__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2"


    // $ANTLR start "rule__Inertial__Group__2__Impl"
    // InternalDsl.g:1421:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__InertiaAssignment_2 ) ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1425:1: ( ( ( rule__Inertial__InertiaAssignment_2 ) ) )
            // InternalDsl.g:1426:1: ( ( rule__Inertial__InertiaAssignment_2 ) )
            {
            // InternalDsl.g:1426:1: ( ( rule__Inertial__InertiaAssignment_2 ) )
            // InternalDsl.g:1427:2: ( rule__Inertial__InertiaAssignment_2 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_2()); 
            // InternalDsl.g:1428:2: ( rule__Inertial__InertiaAssignment_2 )
            // InternalDsl.g:1428:3: rule__Inertial__InertiaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalDsl.g:1437:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1441:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalDsl.g:1442:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Visual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0"


    // $ANTLR start "rule__Visual__Group__0__Impl"
    // InternalDsl.g:1449:1: rule__Visual__Group__0__Impl : ( ( rule__Visual__MaterialAssignment_0 )? ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1453:1: ( ( ( rule__Visual__MaterialAssignment_0 )? ) )
            // InternalDsl.g:1454:1: ( ( rule__Visual__MaterialAssignment_0 )? )
            {
            // InternalDsl.g:1454:1: ( ( rule__Visual__MaterialAssignment_0 )? )
            // InternalDsl.g:1455:2: ( rule__Visual__MaterialAssignment_0 )?
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_0()); 
            // InternalDsl.g:1456:2: ( rule__Visual__MaterialAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=21 && LA15_0<=22)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1456:3: rule__Visual__MaterialAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__MaterialAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getMaterialAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0__Impl"


    // $ANTLR start "rule__Visual__Group__1"
    // InternalDsl.g:1464:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1468:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalDsl.g:1469:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Visual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1"


    // $ANTLR start "rule__Visual__Group__1__Impl"
    // InternalDsl.g:1476:1: rule__Visual__Group__1__Impl : ( ( rule__Visual__OriginAssignment_1 ) ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1480:1: ( ( ( rule__Visual__OriginAssignment_1 ) ) )
            // InternalDsl.g:1481:1: ( ( rule__Visual__OriginAssignment_1 ) )
            {
            // InternalDsl.g:1481:1: ( ( rule__Visual__OriginAssignment_1 ) )
            // InternalDsl.g:1482:2: ( rule__Visual__OriginAssignment_1 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_1()); 
            // InternalDsl.g:1483:2: ( rule__Visual__OriginAssignment_1 )
            // InternalDsl.g:1483:3: rule__Visual__OriginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__OriginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1__Impl"


    // $ANTLR start "rule__Visual__Group__2"
    // InternalDsl.g:1491:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1495:1: ( rule__Visual__Group__2__Impl )
            // InternalDsl.g:1496:2: rule__Visual__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2"


    // $ANTLR start "rule__Visual__Group__2__Impl"
    // InternalDsl.g:1502:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__GeometryAssignment_2 ) ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1506:1: ( ( ( rule__Visual__GeometryAssignment_2 ) ) )
            // InternalDsl.g:1507:1: ( ( rule__Visual__GeometryAssignment_2 ) )
            {
            // InternalDsl.g:1507:1: ( ( rule__Visual__GeometryAssignment_2 ) )
            // InternalDsl.g:1508:2: ( rule__Visual__GeometryAssignment_2 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_2()); 
            // InternalDsl.g:1509:2: ( rule__Visual__GeometryAssignment_2 )
            // InternalDsl.g:1509:3: rule__Visual__GeometryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalDsl.g:1518:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalDsl.g:1523:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalDsl.g:1530:1: rule__Collision__Group__0__Impl : ( ( rule__Collision__GeometryAssignment_0 ) ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1534:1: ( ( ( rule__Collision__GeometryAssignment_0 ) ) )
            // InternalDsl.g:1535:1: ( ( rule__Collision__GeometryAssignment_0 ) )
            {
            // InternalDsl.g:1535:1: ( ( rule__Collision__GeometryAssignment_0 ) )
            // InternalDsl.g:1536:2: ( rule__Collision__GeometryAssignment_0 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_0()); 
            // InternalDsl.g:1537:2: ( rule__Collision__GeometryAssignment_0 )
            // InternalDsl.g:1537:3: rule__Collision__GeometryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalDsl.g:1545:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1549:1: ( rule__Collision__Group__1__Impl )
            // InternalDsl.g:1550:2: rule__Collision__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalDsl.g:1556:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__OriginAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1560:1: ( ( ( rule__Collision__OriginAssignment_1 ) ) )
            // InternalDsl.g:1561:1: ( ( rule__Collision__OriginAssignment_1 ) )
            {
            // InternalDsl.g:1561:1: ( ( rule__Collision__OriginAssignment_1 ) )
            // InternalDsl.g:1562:2: ( rule__Collision__OriginAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_1()); 
            // InternalDsl.g:1563:2: ( rule__Collision__OriginAssignment_1 )
            // InternalDsl.g:1563:3: rule__Collision__OriginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__OriginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalDsl.g:1572:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalDsl.g:1577:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalDsl.g:1584:1: rule__Origin__Group__0__Impl : ( () ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( ( () ) )
            // InternalDsl.g:1589:1: ( () )
            {
            // InternalDsl.g:1589:1: ( () )
            // InternalDsl.g:1590:2: ()
            {
             before(grammarAccess.getOriginAccess().getOriginAction_0()); 
            // InternalDsl.g:1591:2: ()
            // InternalDsl.g:1591:3: 
            {
            }

             after(grammarAccess.getOriginAccess().getOriginAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalDsl.g:1599:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1603:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalDsl.g:1604:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalDsl.g:1611:1: rule__Origin__Group__1__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( ( 'Origin' ) )
            // InternalDsl.g:1616:1: ( 'Origin' )
            {
            // InternalDsl.g:1616:1: ( 'Origin' )
            // InternalDsl.g:1617:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalDsl.g:1626:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1630:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalDsl.g:1631:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Origin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalDsl.g:1638:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__XAssignment_2 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1642:1: ( ( ( rule__Origin__XAssignment_2 )? ) )
            // InternalDsl.g:1643:1: ( ( rule__Origin__XAssignment_2 )? )
            {
            // InternalDsl.g:1643:1: ( ( rule__Origin__XAssignment_2 )? )
            // InternalDsl.g:1644:2: ( rule__Origin__XAssignment_2 )?
            {
             before(grammarAccess.getOriginAccess().getXAssignment_2()); 
            // InternalDsl.g:1645:2: ( rule__Origin__XAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==46) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==RULE_INT) ) {
                        alt16=1;
                    }
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1645:3: rule__Origin__XAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__XAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Origin__Group__3"
    // InternalDsl.g:1653:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1657:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalDsl.g:1658:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Origin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3"


    // $ANTLR start "rule__Origin__Group__3__Impl"
    // InternalDsl.g:1665:1: rule__Origin__Group__3__Impl : ( ( rule__Origin__YAssignment_3 )? ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( ( ( rule__Origin__YAssignment_3 )? ) )
            // InternalDsl.g:1670:1: ( ( rule__Origin__YAssignment_3 )? )
            {
            // InternalDsl.g:1670:1: ( ( rule__Origin__YAssignment_3 )? )
            // InternalDsl.g:1671:2: ( rule__Origin__YAssignment_3 )?
            {
             before(grammarAccess.getOriginAccess().getYAssignment_3()); 
            // InternalDsl.g:1672:2: ( rule__Origin__YAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==46) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==RULE_INT) ) {
                        alt17=1;
                    }
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1672:3: rule__Origin__YAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__YAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3__Impl"


    // $ANTLR start "rule__Origin__Group__4"
    // InternalDsl.g:1680:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1684:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalDsl.g:1685:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Origin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4"


    // $ANTLR start "rule__Origin__Group__4__Impl"
    // InternalDsl.g:1692:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__ZAssignment_4 )? ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1696:1: ( ( ( rule__Origin__ZAssignment_4 )? ) )
            // InternalDsl.g:1697:1: ( ( rule__Origin__ZAssignment_4 )? )
            {
            // InternalDsl.g:1697:1: ( ( rule__Origin__ZAssignment_4 )? )
            // InternalDsl.g:1698:2: ( rule__Origin__ZAssignment_4 )?
            {
             before(grammarAccess.getOriginAccess().getZAssignment_4()); 
            // InternalDsl.g:1699:2: ( rule__Origin__ZAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==46) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==RULE_INT) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1699:3: rule__Origin__ZAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__ZAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getZAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__5"
    // InternalDsl.g:1707:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1711:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalDsl.g:1712:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Origin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5"


    // $ANTLR start "rule__Origin__Group__5__Impl"
    // InternalDsl.g:1719:1: rule__Origin__Group__5__Impl : ( ( rule__Origin__RollAssignment_5 )? ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( ( ( rule__Origin__RollAssignment_5 )? ) )
            // InternalDsl.g:1724:1: ( ( rule__Origin__RollAssignment_5 )? )
            {
            // InternalDsl.g:1724:1: ( ( rule__Origin__RollAssignment_5 )? )
            // InternalDsl.g:1725:2: ( rule__Origin__RollAssignment_5 )?
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_5()); 
            // InternalDsl.g:1726:2: ( rule__Origin__RollAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==46) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==RULE_INT) ) {
                        alt19=1;
                    }
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1726:3: rule__Origin__RollAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__RollAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getRollAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5__Impl"


    // $ANTLR start "rule__Origin__Group__6"
    // InternalDsl.g:1734:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl rule__Origin__Group__7 ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1738:1: ( rule__Origin__Group__6__Impl rule__Origin__Group__7 )
            // InternalDsl.g:1739:2: rule__Origin__Group__6__Impl rule__Origin__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Origin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6"


    // $ANTLR start "rule__Origin__Group__6__Impl"
    // InternalDsl.g:1746:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__PitchAssignment_6 )? ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1750:1: ( ( ( rule__Origin__PitchAssignment_6 )? ) )
            // InternalDsl.g:1751:1: ( ( rule__Origin__PitchAssignment_6 )? )
            {
            // InternalDsl.g:1751:1: ( ( rule__Origin__PitchAssignment_6 )? )
            // InternalDsl.g:1752:2: ( rule__Origin__PitchAssignment_6 )?
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_6()); 
            // InternalDsl.g:1753:2: ( rule__Origin__PitchAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==46) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==RULE_INT) ) {
                        alt20=1;
                    }
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1753:3: rule__Origin__PitchAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__PitchAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getPitchAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6__Impl"


    // $ANTLR start "rule__Origin__Group__7"
    // InternalDsl.g:1761:1: rule__Origin__Group__7 : rule__Origin__Group__7__Impl ;
    public final void rule__Origin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1765:1: ( rule__Origin__Group__7__Impl )
            // InternalDsl.g:1766:2: rule__Origin__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__7"


    // $ANTLR start "rule__Origin__Group__7__Impl"
    // InternalDsl.g:1772:1: rule__Origin__Group__7__Impl : ( ( rule__Origin__YawAssignment_7 )? ) ;
    public final void rule__Origin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1776:1: ( ( ( rule__Origin__YawAssignment_7 )? ) )
            // InternalDsl.g:1777:1: ( ( rule__Origin__YawAssignment_7 )? )
            {
            // InternalDsl.g:1777:1: ( ( rule__Origin__YawAssignment_7 )? )
            // InternalDsl.g:1778:2: ( rule__Origin__YawAssignment_7 )?
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_7()); 
            // InternalDsl.g:1779:2: ( rule__Origin__YawAssignment_7 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1779:3: rule__Origin__YawAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__YawAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getYawAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__7__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalDsl.g:1788:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1792:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalDsl.g:1793:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalDsl.g:1800:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( ( () ) )
            // InternalDsl.g:1805:1: ( () )
            {
            // InternalDsl.g:1805:1: ( () )
            // InternalDsl.g:1806:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalDsl.g:1807:2: ()
            // InternalDsl.g:1807:3: 
            {
            }

             after(grammarAccess.getMassAccess().getMassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalDsl.g:1815:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1819:1: ( rule__Mass__Group__1__Impl )
            // InternalDsl.g:1820:2: rule__Mass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalDsl.g:1826:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1830:1: ( ( 'Mass' ) )
            // InternalDsl.g:1831:1: ( 'Mass' )
            {
            // InternalDsl.g:1831:1: ( 'Mass' )
            // InternalDsl.g:1832:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalDsl.g:1842:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1846:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalDsl.g:1847:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Inertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0"


    // $ANTLR start "rule__Inertia__Group__0__Impl"
    // InternalDsl.g:1854:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( ( () ) )
            // InternalDsl.g:1859:1: ( () )
            {
            // InternalDsl.g:1859:1: ( () )
            // InternalDsl.g:1860:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalDsl.g:1861:2: ()
            // InternalDsl.g:1861:3: 
            {
            }

             after(grammarAccess.getInertiaAccess().getInertiaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalDsl.g:1869:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1873:1: ( rule__Inertia__Group__1__Impl )
            // InternalDsl.g:1874:2: rule__Inertia__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1"


    // $ANTLR start "rule__Inertia__Group__1__Impl"
    // InternalDsl.g:1880:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1884:1: ( ( 'Inertia' ) )
            // InternalDsl.g:1885:1: ( 'Inertia' )
            {
            // InternalDsl.g:1885:1: ( 'Inertia' )
            // InternalDsl.g:1886:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalDsl.g:1896:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1900:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalDsl.g:1901:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalDsl.g:1908:1: rule__Color__Group__0__Impl : ( () ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1912:1: ( ( () ) )
            // InternalDsl.g:1913:1: ( () )
            {
            // InternalDsl.g:1913:1: ( () )
            // InternalDsl.g:1914:2: ()
            {
             before(grammarAccess.getColorAccess().getColorAction_0()); 
            // InternalDsl.g:1915:2: ()
            // InternalDsl.g:1915:3: 
            {
            }

             after(grammarAccess.getColorAccess().getColorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalDsl.g:1923:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1927:1: ( rule__Color__Group__1__Impl )
            // InternalDsl.g:1928:2: rule__Color__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalDsl.g:1934:1: rule__Color__Group__1__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1938:1: ( ( 'Color' ) )
            // InternalDsl.g:1939:1: ( 'Color' )
            {
            // InternalDsl.g:1939:1: ( 'Color' )
            // InternalDsl.g:1940:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Texture__Group__0"
    // InternalDsl.g:1950:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1954:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalDsl.g:1955:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Texture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0"


    // $ANTLR start "rule__Texture__Group__0__Impl"
    // InternalDsl.g:1962:1: rule__Texture__Group__0__Impl : ( () ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1966:1: ( ( () ) )
            // InternalDsl.g:1967:1: ( () )
            {
            // InternalDsl.g:1967:1: ( () )
            // InternalDsl.g:1968:2: ()
            {
             before(grammarAccess.getTextureAccess().getTextureAction_0()); 
            // InternalDsl.g:1969:2: ()
            // InternalDsl.g:1969:3: 
            {
            }

             after(grammarAccess.getTextureAccess().getTextureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0__Impl"


    // $ANTLR start "rule__Texture__Group__1"
    // InternalDsl.g:1977:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1981:1: ( rule__Texture__Group__1__Impl )
            // InternalDsl.g:1982:2: rule__Texture__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1"


    // $ANTLR start "rule__Texture__Group__1__Impl"
    // InternalDsl.g:1988:1: rule__Texture__Group__1__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1992:1: ( ( 'Texture' ) )
            // InternalDsl.g:1993:1: ( 'Texture' )
            {
            // InternalDsl.g:1993:1: ( 'Texture' )
            // InternalDsl.g:1994:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getTextureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalDsl.g:2004:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalDsl.g:2009:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalDsl.g:2016:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2020:1: ( ( () ) )
            // InternalDsl.g:2021:1: ( () )
            {
            // InternalDsl.g:2021:1: ( () )
            // InternalDsl.g:2022:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalDsl.g:2023:2: ()
            // InternalDsl.g:2023:3: 
            {
            }

             after(grammarAccess.getBoxAccess().getBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalDsl.g:2031:1: rule__Box__Group__1 : rule__Box__Group__1__Impl ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2035:1: ( rule__Box__Group__1__Impl )
            // InternalDsl.g:2036:2: rule__Box__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalDsl.g:2042:1: rule__Box__Group__1__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2046:1: ( ( 'Box' ) )
            // InternalDsl.g:2047:1: ( 'Box' )
            {
            // InternalDsl.g:2047:1: ( 'Box' )
            // InternalDsl.g:2048:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalDsl.g:2058:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalDsl.g:2063:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalDsl.g:2070:1: rule__Cylinder__Group__0__Impl : ( () ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2074:1: ( ( () ) )
            // InternalDsl.g:2075:1: ( () )
            {
            // InternalDsl.g:2075:1: ( () )
            // InternalDsl.g:2076:2: ()
            {
             before(grammarAccess.getCylinderAccess().getCylinderAction_0()); 
            // InternalDsl.g:2077:2: ()
            // InternalDsl.g:2077:3: 
            {
            }

             after(grammarAccess.getCylinderAccess().getCylinderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalDsl.g:2085:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2089:1: ( rule__Cylinder__Group__1__Impl )
            // InternalDsl.g:2090:2: rule__Cylinder__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalDsl.g:2096:1: rule__Cylinder__Group__1__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2100:1: ( ( 'Cylinder' ) )
            // InternalDsl.g:2101:1: ( 'Cylinder' )
            {
            // InternalDsl.g:2101:1: ( 'Cylinder' )
            // InternalDsl.g:2102:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalDsl.g:2112:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2116:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalDsl.g:2117:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Mesh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0"


    // $ANTLR start "rule__Mesh__Group__0__Impl"
    // InternalDsl.g:2124:1: rule__Mesh__Group__0__Impl : ( () ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2128:1: ( ( () ) )
            // InternalDsl.g:2129:1: ( () )
            {
            // InternalDsl.g:2129:1: ( () )
            // InternalDsl.g:2130:2: ()
            {
             before(grammarAccess.getMeshAccess().getMeshAction_0()); 
            // InternalDsl.g:2131:2: ()
            // InternalDsl.g:2131:3: 
            {
            }

             after(grammarAccess.getMeshAccess().getMeshAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalDsl.g:2139:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2143:1: ( rule__Mesh__Group__1__Impl )
            // InternalDsl.g:2144:2: rule__Mesh__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1"


    // $ANTLR start "rule__Mesh__Group__1__Impl"
    // InternalDsl.g:2150:1: rule__Mesh__Group__1__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2154:1: ( ( 'Mesh' ) )
            // InternalDsl.g:2155:1: ( 'Mesh' )
            {
            // InternalDsl.g:2155:1: ( 'Mesh' )
            // InternalDsl.g:2156:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getMeshKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalDsl.g:2166:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2170:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalDsl.g:2171:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalDsl.g:2178:1: rule__Sphere__Group__0__Impl : ( () ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2182:1: ( ( () ) )
            // InternalDsl.g:2183:1: ( () )
            {
            // InternalDsl.g:2183:1: ( () )
            // InternalDsl.g:2184:2: ()
            {
             before(grammarAccess.getSphereAccess().getSphereAction_0()); 
            // InternalDsl.g:2185:2: ()
            // InternalDsl.g:2185:3: 
            {
            }

             after(grammarAccess.getSphereAccess().getSphereAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalDsl.g:2193:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2197:1: ( rule__Sphere__Group__1__Impl )
            // InternalDsl.g:2198:2: rule__Sphere__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalDsl.g:2204:1: rule__Sphere__Group__1__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2208:1: ( ( 'Sphere' ) )
            // InternalDsl.g:2209:1: ( 'Sphere' )
            {
            // InternalDsl.g:2209:1: ( 'Sphere' )
            // InternalDsl.g:2210:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalDsl.g:2220:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2224:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalDsl.g:2225:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Limit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0"


    // $ANTLR start "rule__Limit__Group__0__Impl"
    // InternalDsl.g:2232:1: rule__Limit__Group__0__Impl : ( () ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2236:1: ( ( () ) )
            // InternalDsl.g:2237:1: ( () )
            {
            // InternalDsl.g:2237:1: ( () )
            // InternalDsl.g:2238:2: ()
            {
             before(grammarAccess.getLimitAccess().getLimitAction_0()); 
            // InternalDsl.g:2239:2: ()
            // InternalDsl.g:2239:3: 
            {
            }

             after(grammarAccess.getLimitAccess().getLimitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalDsl.g:2247:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2251:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalDsl.g:2252:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Limit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1"


    // $ANTLR start "rule__Limit__Group__1__Impl"
    // InternalDsl.g:2259:1: rule__Limit__Group__1__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2263:1: ( ( 'Limit' ) )
            // InternalDsl.g:2264:1: ( 'Limit' )
            {
            // InternalDsl.g:2264:1: ( 'Limit' )
            // InternalDsl.g:2265:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLimitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__2"
    // InternalDsl.g:2274:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2278:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalDsl.g:2279:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Limit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2"


    // $ANTLR start "rule__Limit__Group__2__Impl"
    // InternalDsl.g:2286:1: rule__Limit__Group__2__Impl : ( ( rule__Limit__LowerAssignment_2 )? ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2290:1: ( ( ( rule__Limit__LowerAssignment_2 )? ) )
            // InternalDsl.g:2291:1: ( ( rule__Limit__LowerAssignment_2 )? )
            {
            // InternalDsl.g:2291:1: ( ( rule__Limit__LowerAssignment_2 )? )
            // InternalDsl.g:2292:2: ( rule__Limit__LowerAssignment_2 )?
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_2()); 
            // InternalDsl.g:2293:2: ( rule__Limit__LowerAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==46) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==RULE_INT) ) {
                        alt22=1;
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2293:3: rule__Limit__LowerAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__LowerAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2__Impl"


    // $ANTLR start "rule__Limit__Group__3"
    // InternalDsl.g:2301:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2305:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalDsl.g:2306:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Limit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3"


    // $ANTLR start "rule__Limit__Group__3__Impl"
    // InternalDsl.g:2313:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__UpperAssignment_3 )? ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2317:1: ( ( ( rule__Limit__UpperAssignment_3 )? ) )
            // InternalDsl.g:2318:1: ( ( rule__Limit__UpperAssignment_3 )? )
            {
            // InternalDsl.g:2318:1: ( ( rule__Limit__UpperAssignment_3 )? )
            // InternalDsl.g:2319:2: ( rule__Limit__UpperAssignment_3 )?
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_3()); 
            // InternalDsl.g:2320:2: ( rule__Limit__UpperAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==46) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_INT) ) {
                        alt23=1;
                    }
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2320:3: rule__Limit__UpperAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__UpperAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__4"
    // InternalDsl.g:2328:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2332:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalDsl.g:2333:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Limit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4"


    // $ANTLR start "rule__Limit__Group__4__Impl"
    // InternalDsl.g:2340:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__EffortAssignment_4 )? ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( ( ( rule__Limit__EffortAssignment_4 )? ) )
            // InternalDsl.g:2345:1: ( ( rule__Limit__EffortAssignment_4 )? )
            {
            // InternalDsl.g:2345:1: ( ( rule__Limit__EffortAssignment_4 )? )
            // InternalDsl.g:2346:2: ( rule__Limit__EffortAssignment_4 )?
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_4()); 
            // InternalDsl.g:2347:2: ( rule__Limit__EffortAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==46) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==RULE_INT) ) {
                        alt24=1;
                    }
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2347:3: rule__Limit__EffortAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__EffortAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4__Impl"


    // $ANTLR start "rule__Limit__Group__5"
    // InternalDsl.g:2355:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2359:1: ( rule__Limit__Group__5__Impl )
            // InternalDsl.g:2360:2: rule__Limit__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5"


    // $ANTLR start "rule__Limit__Group__5__Impl"
    // InternalDsl.g:2366:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__VelocityAssignment_5 )? ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2370:1: ( ( ( rule__Limit__VelocityAssignment_5 )? ) )
            // InternalDsl.g:2371:1: ( ( rule__Limit__VelocityAssignment_5 )? )
            {
            // InternalDsl.g:2371:1: ( ( rule__Limit__VelocityAssignment_5 )? )
            // InternalDsl.g:2372:2: ( rule__Limit__VelocityAssignment_5 )?
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 
            // InternalDsl.g:2373:2: ( rule__Limit__VelocityAssignment_5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2373:3: rule__Limit__VelocityAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__VelocityAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5__Impl"


    // $ANTLR start "rule__Axis__Group__0"
    // InternalDsl.g:2382:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2386:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalDsl.g:2387:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Axis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0"


    // $ANTLR start "rule__Axis__Group__0__Impl"
    // InternalDsl.g:2394:1: rule__Axis__Group__0__Impl : ( () ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( ( () ) )
            // InternalDsl.g:2399:1: ( () )
            {
            // InternalDsl.g:2399:1: ( () )
            // InternalDsl.g:2400:2: ()
            {
             before(grammarAccess.getAxisAccess().getAxisAction_0()); 
            // InternalDsl.g:2401:2: ()
            // InternalDsl.g:2401:3: 
            {
            }

             after(grammarAccess.getAxisAccess().getAxisAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0__Impl"


    // $ANTLR start "rule__Axis__Group__1"
    // InternalDsl.g:2409:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2413:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalDsl.g:2414:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Axis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1"


    // $ANTLR start "rule__Axis__Group__1__Impl"
    // InternalDsl.g:2421:1: rule__Axis__Group__1__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( ( 'Axis' ) )
            // InternalDsl.g:2426:1: ( 'Axis' )
            {
            // InternalDsl.g:2426:1: ( 'Axis' )
            // InternalDsl.g:2427:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getAxisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1__Impl"


    // $ANTLR start "rule__Axis__Group__2"
    // InternalDsl.g:2436:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2440:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalDsl.g:2441:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Axis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2"


    // $ANTLR start "rule__Axis__Group__2__Impl"
    // InternalDsl.g:2448:1: rule__Axis__Group__2__Impl : ( ( rule__Axis__Group_2__0 )? ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2452:1: ( ( ( rule__Axis__Group_2__0 )? ) )
            // InternalDsl.g:2453:1: ( ( rule__Axis__Group_2__0 )? )
            {
            // InternalDsl.g:2453:1: ( ( rule__Axis__Group_2__0 )? )
            // InternalDsl.g:2454:2: ( rule__Axis__Group_2__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_2()); 
            // InternalDsl.g:2455:2: ( rule__Axis__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:2455:3: rule__Axis__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2__Impl"


    // $ANTLR start "rule__Axis__Group__3"
    // InternalDsl.g:2463:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2467:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalDsl.g:2468:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Axis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3"


    // $ANTLR start "rule__Axis__Group__3__Impl"
    // InternalDsl.g:2475:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__Group_3__0 )? ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( ( ( rule__Axis__Group_3__0 )? ) )
            // InternalDsl.g:2480:1: ( ( rule__Axis__Group_3__0 )? )
            {
            // InternalDsl.g:2480:1: ( ( rule__Axis__Group_3__0 )? )
            // InternalDsl.g:2481:2: ( rule__Axis__Group_3__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_3()); 
            // InternalDsl.g:2482:2: ( rule__Axis__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:2482:3: rule__Axis__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3__Impl"


    // $ANTLR start "rule__Axis__Group__4"
    // InternalDsl.g:2490:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2494:1: ( rule__Axis__Group__4__Impl )
            // InternalDsl.g:2495:2: rule__Axis__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4"


    // $ANTLR start "rule__Axis__Group__4__Impl"
    // InternalDsl.g:2501:1: rule__Axis__Group__4__Impl : ( ( rule__Axis__Group_4__0 )? ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2505:1: ( ( ( rule__Axis__Group_4__0 )? ) )
            // InternalDsl.g:2506:1: ( ( rule__Axis__Group_4__0 )? )
            {
            // InternalDsl.g:2506:1: ( ( rule__Axis__Group_4__0 )? )
            // InternalDsl.g:2507:2: ( rule__Axis__Group_4__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_4()); 
            // InternalDsl.g:2508:2: ( rule__Axis__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:2508:3: rule__Axis__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4__Impl"


    // $ANTLR start "rule__Axis__Group_2__0"
    // InternalDsl.g:2517:1: rule__Axis__Group_2__0 : rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1 ;
    public final void rule__Axis__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2521:1: ( rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1 )
            // InternalDsl.g:2522:2: rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Axis__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__0"


    // $ANTLR start "rule__Axis__Group_2__0__Impl"
    // InternalDsl.g:2529:1: rule__Axis__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__Axis__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2533:1: ( ( 'x' ) )
            // InternalDsl.g:2534:1: ( 'x' )
            {
            // InternalDsl.g:2534:1: ( 'x' )
            // InternalDsl.g:2535:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__0__Impl"


    // $ANTLR start "rule__Axis__Group_2__1"
    // InternalDsl.g:2544:1: rule__Axis__Group_2__1 : rule__Axis__Group_2__1__Impl ;
    public final void rule__Axis__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2548:1: ( rule__Axis__Group_2__1__Impl )
            // InternalDsl.g:2549:2: rule__Axis__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__1"


    // $ANTLR start "rule__Axis__Group_2__1__Impl"
    // InternalDsl.g:2555:1: rule__Axis__Group_2__1__Impl : ( ( rule__Axis__XAssignment_2_1 ) ) ;
    public final void rule__Axis__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2559:1: ( ( ( rule__Axis__XAssignment_2_1 ) ) )
            // InternalDsl.g:2560:1: ( ( rule__Axis__XAssignment_2_1 ) )
            {
            // InternalDsl.g:2560:1: ( ( rule__Axis__XAssignment_2_1 ) )
            // InternalDsl.g:2561:2: ( rule__Axis__XAssignment_2_1 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_2_1()); 
            // InternalDsl.g:2562:2: ( rule__Axis__XAssignment_2_1 )
            // InternalDsl.g:2562:3: rule__Axis__XAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__1__Impl"


    // $ANTLR start "rule__Axis__Group_3__0"
    // InternalDsl.g:2571:1: rule__Axis__Group_3__0 : rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1 ;
    public final void rule__Axis__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2575:1: ( rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1 )
            // InternalDsl.g:2576:2: rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Axis__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__0"


    // $ANTLR start "rule__Axis__Group_3__0__Impl"
    // InternalDsl.g:2583:1: rule__Axis__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__Axis__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2587:1: ( ( 'y' ) )
            // InternalDsl.g:2588:1: ( 'y' )
            {
            // InternalDsl.g:2588:1: ( 'y' )
            // InternalDsl.g:2589:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__0__Impl"


    // $ANTLR start "rule__Axis__Group_3__1"
    // InternalDsl.g:2598:1: rule__Axis__Group_3__1 : rule__Axis__Group_3__1__Impl ;
    public final void rule__Axis__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2602:1: ( rule__Axis__Group_3__1__Impl )
            // InternalDsl.g:2603:2: rule__Axis__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__1"


    // $ANTLR start "rule__Axis__Group_3__1__Impl"
    // InternalDsl.g:2609:1: rule__Axis__Group_3__1__Impl : ( ( rule__Axis__YAssignment_3_1 ) ) ;
    public final void rule__Axis__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2613:1: ( ( ( rule__Axis__YAssignment_3_1 ) ) )
            // InternalDsl.g:2614:1: ( ( rule__Axis__YAssignment_3_1 ) )
            {
            // InternalDsl.g:2614:1: ( ( rule__Axis__YAssignment_3_1 ) )
            // InternalDsl.g:2615:2: ( rule__Axis__YAssignment_3_1 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_3_1()); 
            // InternalDsl.g:2616:2: ( rule__Axis__YAssignment_3_1 )
            // InternalDsl.g:2616:3: rule__Axis__YAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__1__Impl"


    // $ANTLR start "rule__Axis__Group_4__0"
    // InternalDsl.g:2625:1: rule__Axis__Group_4__0 : rule__Axis__Group_4__0__Impl rule__Axis__Group_4__1 ;
    public final void rule__Axis__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2629:1: ( rule__Axis__Group_4__0__Impl rule__Axis__Group_4__1 )
            // InternalDsl.g:2630:2: rule__Axis__Group_4__0__Impl rule__Axis__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Axis__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_4__0"


    // $ANTLR start "rule__Axis__Group_4__0__Impl"
    // InternalDsl.g:2637:1: rule__Axis__Group_4__0__Impl : ( 'z' ) ;
    public final void rule__Axis__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2641:1: ( ( 'z' ) )
            // InternalDsl.g:2642:1: ( 'z' )
            {
            // InternalDsl.g:2642:1: ( 'z' )
            // InternalDsl.g:2643:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_4__0__Impl"


    // $ANTLR start "rule__Axis__Group_4__1"
    // InternalDsl.g:2652:1: rule__Axis__Group_4__1 : rule__Axis__Group_4__1__Impl ;
    public final void rule__Axis__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2656:1: ( rule__Axis__Group_4__1__Impl )
            // InternalDsl.g:2657:2: rule__Axis__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_4__1"


    // $ANTLR start "rule__Axis__Group_4__1__Impl"
    // InternalDsl.g:2663:1: rule__Axis__Group_4__1__Impl : ( ( rule__Axis__ZAssignment_4_1 ) ) ;
    public final void rule__Axis__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2667:1: ( ( ( rule__Axis__ZAssignment_4_1 ) ) )
            // InternalDsl.g:2668:1: ( ( rule__Axis__ZAssignment_4_1 ) )
            {
            // InternalDsl.g:2668:1: ( ( rule__Axis__ZAssignment_4_1 ) )
            // InternalDsl.g:2669:2: ( rule__Axis__ZAssignment_4_1 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_4_1()); 
            // InternalDsl.g:2670:2: ( rule__Axis__ZAssignment_4_1 )
            // InternalDsl.g:2670:3: rule__Axis__ZAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_4__1__Impl"


    // $ANTLR start "rule__Calibration__Group__0"
    // InternalDsl.g:2679:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2683:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalDsl.g:2684:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Calibration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0"


    // $ANTLR start "rule__Calibration__Group__0__Impl"
    // InternalDsl.g:2691:1: rule__Calibration__Group__0__Impl : ( () ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2695:1: ( ( () ) )
            // InternalDsl.g:2696:1: ( () )
            {
            // InternalDsl.g:2696:1: ( () )
            // InternalDsl.g:2697:2: ()
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 
            // InternalDsl.g:2698:2: ()
            // InternalDsl.g:2698:3: 
            {
            }

             after(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0__Impl"


    // $ANTLR start "rule__Calibration__Group__1"
    // InternalDsl.g:2706:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2710:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalDsl.g:2711:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Calibration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1"


    // $ANTLR start "rule__Calibration__Group__1__Impl"
    // InternalDsl.g:2718:1: rule__Calibration__Group__1__Impl : ( 'Calibration' ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2722:1: ( ( 'Calibration' ) )
            // InternalDsl.g:2723:1: ( 'Calibration' )
            {
            // InternalDsl.g:2723:1: ( 'Calibration' )
            // InternalDsl.g:2724:2: 'Calibration'
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1__Impl"


    // $ANTLR start "rule__Calibration__Group__2"
    // InternalDsl.g:2733:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2737:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalDsl.g:2738:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Calibration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2"


    // $ANTLR start "rule__Calibration__Group__2__Impl"
    // InternalDsl.g:2745:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__Group_2__0 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2749:1: ( ( ( rule__Calibration__Group_2__0 )? ) )
            // InternalDsl.g:2750:1: ( ( rule__Calibration__Group_2__0 )? )
            {
            // InternalDsl.g:2750:1: ( ( rule__Calibration__Group_2__0 )? )
            // InternalDsl.g:2751:2: ( rule__Calibration__Group_2__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_2()); 
            // InternalDsl.g:2752:2: ( rule__Calibration__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:2752:3: rule__Calibration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2__Impl"


    // $ANTLR start "rule__Calibration__Group__3"
    // InternalDsl.g:2760:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2764:1: ( rule__Calibration__Group__3__Impl )
            // InternalDsl.g:2765:2: rule__Calibration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3"


    // $ANTLR start "rule__Calibration__Group__3__Impl"
    // InternalDsl.g:2771:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Group_3__0 )? ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2775:1: ( ( ( rule__Calibration__Group_3__0 )? ) )
            // InternalDsl.g:2776:1: ( ( rule__Calibration__Group_3__0 )? )
            {
            // InternalDsl.g:2776:1: ( ( rule__Calibration__Group_3__0 )? )
            // InternalDsl.g:2777:2: ( rule__Calibration__Group_3__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_3()); 
            // InternalDsl.g:2778:2: ( rule__Calibration__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:2778:3: rule__Calibration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3__Impl"


    // $ANTLR start "rule__Calibration__Group_2__0"
    // InternalDsl.g:2787:1: rule__Calibration__Group_2__0 : rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 ;
    public final void rule__Calibration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2791:1: ( rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 )
            // InternalDsl.g:2792:2: rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Calibration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0"


    // $ANTLR start "rule__Calibration__Group_2__0__Impl"
    // InternalDsl.g:2799:1: rule__Calibration__Group_2__0__Impl : ( 'Rising' ) ;
    public final void rule__Calibration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2803:1: ( ( 'Rising' ) )
            // InternalDsl.g:2804:1: ( 'Rising' )
            {
            // InternalDsl.g:2804:1: ( 'Rising' )
            // InternalDsl.g:2805:2: 'Rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0__Impl"


    // $ANTLR start "rule__Calibration__Group_2__1"
    // InternalDsl.g:2814:1: rule__Calibration__Group_2__1 : rule__Calibration__Group_2__1__Impl ;
    public final void rule__Calibration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2818:1: ( rule__Calibration__Group_2__1__Impl )
            // InternalDsl.g:2819:2: rule__Calibration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1"


    // $ANTLR start "rule__Calibration__Group_2__1__Impl"
    // InternalDsl.g:2825:1: rule__Calibration__Group_2__1__Impl : ( ( rule__Calibration__RisingAssignment_2_1 ) ) ;
    public final void rule__Calibration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2829:1: ( ( ( rule__Calibration__RisingAssignment_2_1 ) ) )
            // InternalDsl.g:2830:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            {
            // InternalDsl.g:2830:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            // InternalDsl.g:2831:2: ( rule__Calibration__RisingAssignment_2_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 
            // InternalDsl.g:2832:2: ( rule__Calibration__RisingAssignment_2_1 )
            // InternalDsl.g:2832:3: rule__Calibration__RisingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__RisingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1__Impl"


    // $ANTLR start "rule__Calibration__Group_3__0"
    // InternalDsl.g:2841:1: rule__Calibration__Group_3__0 : rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 ;
    public final void rule__Calibration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2845:1: ( rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 )
            // InternalDsl.g:2846:2: rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Calibration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0"


    // $ANTLR start "rule__Calibration__Group_3__0__Impl"
    // InternalDsl.g:2853:1: rule__Calibration__Group_3__0__Impl : ( 'Falling' ) ;
    public final void rule__Calibration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2857:1: ( ( 'Falling' ) )
            // InternalDsl.g:2858:1: ( 'Falling' )
            {
            // InternalDsl.g:2858:1: ( 'Falling' )
            // InternalDsl.g:2859:2: 'Falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0__Impl"


    // $ANTLR start "rule__Calibration__Group_3__1"
    // InternalDsl.g:2868:1: rule__Calibration__Group_3__1 : rule__Calibration__Group_3__1__Impl ;
    public final void rule__Calibration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2872:1: ( rule__Calibration__Group_3__1__Impl )
            // InternalDsl.g:2873:2: rule__Calibration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1"


    // $ANTLR start "rule__Calibration__Group_3__1__Impl"
    // InternalDsl.g:2879:1: rule__Calibration__Group_3__1__Impl : ( ( rule__Calibration__FallingAssignment_3_1 ) ) ;
    public final void rule__Calibration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2883:1: ( ( ( rule__Calibration__FallingAssignment_3_1 ) ) )
            // InternalDsl.g:2884:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            {
            // InternalDsl.g:2884:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            // InternalDsl.g:2885:2: ( rule__Calibration__FallingAssignment_3_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 
            // InternalDsl.g:2886:2: ( rule__Calibration__FallingAssignment_3_1 )
            // InternalDsl.g:2886:3: rule__Calibration__FallingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__FallingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__0"
    // InternalDsl.g:2895:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2899:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalDsl.g:2900:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Dynamics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0"


    // $ANTLR start "rule__Dynamics__Group__0__Impl"
    // InternalDsl.g:2907:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2911:1: ( ( () ) )
            // InternalDsl.g:2912:1: ( () )
            {
            // InternalDsl.g:2912:1: ( () )
            // InternalDsl.g:2913:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalDsl.g:2914:2: ()
            // InternalDsl.g:2914:3: 
            {
            }

             after(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0__Impl"


    // $ANTLR start "rule__Dynamics__Group__1"
    // InternalDsl.g:2922:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2926:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalDsl.g:2927:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Dynamics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1"


    // $ANTLR start "rule__Dynamics__Group__1__Impl"
    // InternalDsl.g:2934:1: rule__Dynamics__Group__1__Impl : ( 'Dynamics' ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2938:1: ( ( 'Dynamics' ) )
            // InternalDsl.g:2939:1: ( 'Dynamics' )
            {
            // InternalDsl.g:2939:1: ( 'Dynamics' )
            // InternalDsl.g:2940:2: 'Dynamics'
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__2"
    // InternalDsl.g:2949:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2953:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalDsl.g:2954:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Dynamics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2"


    // $ANTLR start "rule__Dynamics__Group__2__Impl"
    // InternalDsl.g:2961:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__Group_2__0 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2965:1: ( ( ( rule__Dynamics__Group_2__0 )? ) )
            // InternalDsl.g:2966:1: ( ( rule__Dynamics__Group_2__0 )? )
            {
            // InternalDsl.g:2966:1: ( ( rule__Dynamics__Group_2__0 )? )
            // InternalDsl.g:2967:2: ( rule__Dynamics__Group_2__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_2()); 
            // InternalDsl.g:2968:2: ( rule__Dynamics__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:2968:3: rule__Dynamics__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2__Impl"


    // $ANTLR start "rule__Dynamics__Group__3"
    // InternalDsl.g:2976:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2980:1: ( rule__Dynamics__Group__3__Impl )
            // InternalDsl.g:2981:2: rule__Dynamics__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3"


    // $ANTLR start "rule__Dynamics__Group__3__Impl"
    // InternalDsl.g:2987:1: rule__Dynamics__Group__3__Impl : ( ( rule__Dynamics__Group_3__0 )? ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2991:1: ( ( ( rule__Dynamics__Group_3__0 )? ) )
            // InternalDsl.g:2992:1: ( ( rule__Dynamics__Group_3__0 )? )
            {
            // InternalDsl.g:2992:1: ( ( rule__Dynamics__Group_3__0 )? )
            // InternalDsl.g:2993:2: ( rule__Dynamics__Group_3__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_3()); 
            // InternalDsl.g:2994:2: ( rule__Dynamics__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:2994:3: rule__Dynamics__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__0"
    // InternalDsl.g:3003:1: rule__Dynamics__Group_2__0 : rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 ;
    public final void rule__Dynamics__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3007:1: ( rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 )
            // InternalDsl.g:3008:2: rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Dynamics__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0"


    // $ANTLR start "rule__Dynamics__Group_2__0__Impl"
    // InternalDsl.g:3015:1: rule__Dynamics__Group_2__0__Impl : ( 'Friction' ) ;
    public final void rule__Dynamics__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3019:1: ( ( 'Friction' ) )
            // InternalDsl.g:3020:1: ( 'Friction' )
            {
            // InternalDsl.g:3020:1: ( 'Friction' )
            // InternalDsl.g:3021:2: 'Friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__1"
    // InternalDsl.g:3030:1: rule__Dynamics__Group_2__1 : rule__Dynamics__Group_2__1__Impl ;
    public final void rule__Dynamics__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3034:1: ( rule__Dynamics__Group_2__1__Impl )
            // InternalDsl.g:3035:2: rule__Dynamics__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1"


    // $ANTLR start "rule__Dynamics__Group_2__1__Impl"
    // InternalDsl.g:3041:1: rule__Dynamics__Group_2__1__Impl : ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) ;
    public final void rule__Dynamics__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3045:1: ( ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) )
            // InternalDsl.g:3046:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            {
            // InternalDsl.g:3046:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            // InternalDsl.g:3047:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 
            // InternalDsl.g:3048:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            // InternalDsl.g:3048:3: rule__Dynamics__FrictionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__FrictionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__0"
    // InternalDsl.g:3057:1: rule__Dynamics__Group_3__0 : rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 ;
    public final void rule__Dynamics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3061:1: ( rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 )
            // InternalDsl.g:3062:2: rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Dynamics__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0"


    // $ANTLR start "rule__Dynamics__Group_3__0__Impl"
    // InternalDsl.g:3069:1: rule__Dynamics__Group_3__0__Impl : ( 'Damping' ) ;
    public final void rule__Dynamics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3073:1: ( ( 'Damping' ) )
            // InternalDsl.g:3074:1: ( 'Damping' )
            {
            // InternalDsl.g:3074:1: ( 'Damping' )
            // InternalDsl.g:3075:2: 'Damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__1"
    // InternalDsl.g:3084:1: rule__Dynamics__Group_3__1 : rule__Dynamics__Group_3__1__Impl ;
    public final void rule__Dynamics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3088:1: ( rule__Dynamics__Group_3__1__Impl )
            // InternalDsl.g:3089:2: rule__Dynamics__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1"


    // $ANTLR start "rule__Dynamics__Group_3__1__Impl"
    // InternalDsl.g:3095:1: rule__Dynamics__Group_3__1__Impl : ( ( rule__Dynamics__DampingAssignment_3_1 ) ) ;
    public final void rule__Dynamics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3099:1: ( ( ( rule__Dynamics__DampingAssignment_3_1 ) ) )
            // InternalDsl.g:3100:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            {
            // InternalDsl.g:3100:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            // InternalDsl.g:3101:2: ( rule__Dynamics__DampingAssignment_3_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 
            // InternalDsl.g:3102:2: ( rule__Dynamics__DampingAssignment_3_1 )
            // InternalDsl.g:3102:3: rule__Dynamics__DampingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__DampingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1__Impl"


    // $ANTLR start "rule__Mimic__Group__0"
    // InternalDsl.g:3111:1: rule__Mimic__Group__0 : rule__Mimic__Group__0__Impl rule__Mimic__Group__1 ;
    public final void rule__Mimic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3115:1: ( rule__Mimic__Group__0__Impl rule__Mimic__Group__1 )
            // InternalDsl.g:3116:2: rule__Mimic__Group__0__Impl rule__Mimic__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Mimic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0"


    // $ANTLR start "rule__Mimic__Group__0__Impl"
    // InternalDsl.g:3123:1: rule__Mimic__Group__0__Impl : ( () ) ;
    public final void rule__Mimic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3127:1: ( ( () ) )
            // InternalDsl.g:3128:1: ( () )
            {
            // InternalDsl.g:3128:1: ( () )
            // InternalDsl.g:3129:2: ()
            {
             before(grammarAccess.getMimicAccess().getMimicAction_0()); 
            // InternalDsl.g:3130:2: ()
            // InternalDsl.g:3130:3: 
            {
            }

             after(grammarAccess.getMimicAccess().getMimicAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0__Impl"


    // $ANTLR start "rule__Mimic__Group__1"
    // InternalDsl.g:3138:1: rule__Mimic__Group__1 : rule__Mimic__Group__1__Impl rule__Mimic__Group__2 ;
    public final void rule__Mimic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3142:1: ( rule__Mimic__Group__1__Impl rule__Mimic__Group__2 )
            // InternalDsl.g:3143:2: rule__Mimic__Group__1__Impl rule__Mimic__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Mimic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1"


    // $ANTLR start "rule__Mimic__Group__1__Impl"
    // InternalDsl.g:3150:1: rule__Mimic__Group__1__Impl : ( 'Mimic' ) ;
    public final void rule__Mimic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3154:1: ( ( 'Mimic' ) )
            // InternalDsl.g:3155:1: ( 'Mimic' )
            {
            // InternalDsl.g:3155:1: ( 'Mimic' )
            // InternalDsl.g:3156:2: 'Mimic'
            {
             before(grammarAccess.getMimicAccess().getMimicKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1__Impl"


    // $ANTLR start "rule__Mimic__Group__2"
    // InternalDsl.g:3165:1: rule__Mimic__Group__2 : rule__Mimic__Group__2__Impl rule__Mimic__Group__3 ;
    public final void rule__Mimic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3169:1: ( rule__Mimic__Group__2__Impl rule__Mimic__Group__3 )
            // InternalDsl.g:3170:2: rule__Mimic__Group__2__Impl rule__Mimic__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Mimic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2"


    // $ANTLR start "rule__Mimic__Group__2__Impl"
    // InternalDsl.g:3177:1: rule__Mimic__Group__2__Impl : ( ( rule__Mimic__Group_2__0 )? ) ;
    public final void rule__Mimic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3181:1: ( ( ( rule__Mimic__Group_2__0 )? ) )
            // InternalDsl.g:3182:1: ( ( rule__Mimic__Group_2__0 )? )
            {
            // InternalDsl.g:3182:1: ( ( rule__Mimic__Group_2__0 )? )
            // InternalDsl.g:3183:2: ( rule__Mimic__Group_2__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_2()); 
            // InternalDsl.g:3184:2: ( rule__Mimic__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:3184:3: rule__Mimic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2__Impl"


    // $ANTLR start "rule__Mimic__Group__3"
    // InternalDsl.g:3192:1: rule__Mimic__Group__3 : rule__Mimic__Group__3__Impl ;
    public final void rule__Mimic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3196:1: ( rule__Mimic__Group__3__Impl )
            // InternalDsl.g:3197:2: rule__Mimic__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3"


    // $ANTLR start "rule__Mimic__Group__3__Impl"
    // InternalDsl.g:3203:1: rule__Mimic__Group__3__Impl : ( ( rule__Mimic__Group_3__0 )? ) ;
    public final void rule__Mimic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3207:1: ( ( ( rule__Mimic__Group_3__0 )? ) )
            // InternalDsl.g:3208:1: ( ( rule__Mimic__Group_3__0 )? )
            {
            // InternalDsl.g:3208:1: ( ( rule__Mimic__Group_3__0 )? )
            // InternalDsl.g:3209:2: ( rule__Mimic__Group_3__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_3()); 
            // InternalDsl.g:3210:2: ( rule__Mimic__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:3210:3: rule__Mimic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3__Impl"


    // $ANTLR start "rule__Mimic__Group_2__0"
    // InternalDsl.g:3219:1: rule__Mimic__Group_2__0 : rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1 ;
    public final void rule__Mimic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3223:1: ( rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1 )
            // InternalDsl.g:3224:2: rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Mimic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__0"


    // $ANTLR start "rule__Mimic__Group_2__0__Impl"
    // InternalDsl.g:3231:1: rule__Mimic__Group_2__0__Impl : ( 'Multiplier' ) ;
    public final void rule__Mimic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3235:1: ( ( 'Multiplier' ) )
            // InternalDsl.g:3236:1: ( 'Multiplier' )
            {
            // InternalDsl.g:3236:1: ( 'Multiplier' )
            // InternalDsl.g:3237:2: 'Multiplier'
            {
             before(grammarAccess.getMimicAccess().getMultiplierKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMultiplierKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__0__Impl"


    // $ANTLR start "rule__Mimic__Group_2__1"
    // InternalDsl.g:3246:1: rule__Mimic__Group_2__1 : rule__Mimic__Group_2__1__Impl ;
    public final void rule__Mimic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3250:1: ( rule__Mimic__Group_2__1__Impl )
            // InternalDsl.g:3251:2: rule__Mimic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__1"


    // $ANTLR start "rule__Mimic__Group_2__1__Impl"
    // InternalDsl.g:3257:1: rule__Mimic__Group_2__1__Impl : ( ( rule__Mimic__MultiplierAssignment_2_1 ) ) ;
    public final void rule__Mimic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3261:1: ( ( ( rule__Mimic__MultiplierAssignment_2_1 ) ) )
            // InternalDsl.g:3262:1: ( ( rule__Mimic__MultiplierAssignment_2_1 ) )
            {
            // InternalDsl.g:3262:1: ( ( rule__Mimic__MultiplierAssignment_2_1 ) )
            // InternalDsl.g:3263:2: ( rule__Mimic__MultiplierAssignment_2_1 )
            {
             before(grammarAccess.getMimicAccess().getMultiplierAssignment_2_1()); 
            // InternalDsl.g:3264:2: ( rule__Mimic__MultiplierAssignment_2_1 )
            // InternalDsl.g:3264:3: rule__Mimic__MultiplierAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__MultiplierAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getMultiplierAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__1__Impl"


    // $ANTLR start "rule__Mimic__Group_3__0"
    // InternalDsl.g:3273:1: rule__Mimic__Group_3__0 : rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 ;
    public final void rule__Mimic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3277:1: ( rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 )
            // InternalDsl.g:3278:2: rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Mimic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0"


    // $ANTLR start "rule__Mimic__Group_3__0__Impl"
    // InternalDsl.g:3285:1: rule__Mimic__Group_3__0__Impl : ( 'OffSet' ) ;
    public final void rule__Mimic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3289:1: ( ( 'OffSet' ) )
            // InternalDsl.g:3290:1: ( 'OffSet' )
            {
            // InternalDsl.g:3290:1: ( 'OffSet' )
            // InternalDsl.g:3291:2: 'OffSet'
            {
             before(grammarAccess.getMimicAccess().getOffSetKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getOffSetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0__Impl"


    // $ANTLR start "rule__Mimic__Group_3__1"
    // InternalDsl.g:3300:1: rule__Mimic__Group_3__1 : rule__Mimic__Group_3__1__Impl ;
    public final void rule__Mimic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3304:1: ( rule__Mimic__Group_3__1__Impl )
            // InternalDsl.g:3305:2: rule__Mimic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1"


    // $ANTLR start "rule__Mimic__Group_3__1__Impl"
    // InternalDsl.g:3311:1: rule__Mimic__Group_3__1__Impl : ( ( rule__Mimic__OffSetAssignment_3_1 ) ) ;
    public final void rule__Mimic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3315:1: ( ( ( rule__Mimic__OffSetAssignment_3_1 ) ) )
            // InternalDsl.g:3316:1: ( ( rule__Mimic__OffSetAssignment_3_1 ) )
            {
            // InternalDsl.g:3316:1: ( ( rule__Mimic__OffSetAssignment_3_1 ) )
            // InternalDsl.g:3317:2: ( rule__Mimic__OffSetAssignment_3_1 )
            {
             before(grammarAccess.getMimicAccess().getOffSetAssignment_3_1()); 
            // InternalDsl.g:3318:2: ( rule__Mimic__OffSetAssignment_3_1 )
            // InternalDsl.g:3318:3: rule__Mimic__OffSetAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__OffSetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getOffSetAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__0"
    // InternalDsl.g:3327:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3331:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalDsl.g:3332:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__SafetyController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0"


    // $ANTLR start "rule__SafetyController__Group__0__Impl"
    // InternalDsl.g:3339:1: rule__SafetyController__Group__0__Impl : ( () ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3343:1: ( ( () ) )
            // InternalDsl.g:3344:1: ( () )
            {
            // InternalDsl.g:3344:1: ( () )
            // InternalDsl.g:3345:2: ()
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerAction_0()); 
            // InternalDsl.g:3346:2: ()
            // InternalDsl.g:3346:3: 
            {
            }

             after(grammarAccess.getSafetyControllerAccess().getSafetyControllerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0__Impl"


    // $ANTLR start "rule__SafetyController__Group__1"
    // InternalDsl.g:3354:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3358:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalDsl.g:3359:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__SafetyController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1"


    // $ANTLR start "rule__SafetyController__Group__1__Impl"
    // InternalDsl.g:3366:1: rule__SafetyController__Group__1__Impl : ( 'SafetyController' ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3370:1: ( ( 'SafetyController' ) )
            // InternalDsl.g:3371:1: ( 'SafetyController' )
            {
            // InternalDsl.g:3371:1: ( 'SafetyController' )
            // InternalDsl.g:3372:2: 'SafetyController'
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__2"
    // InternalDsl.g:3381:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3385:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalDsl.g:3386:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__SafetyController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2"


    // $ANTLR start "rule__SafetyController__Group__2__Impl"
    // InternalDsl.g:3393:1: rule__SafetyController__Group__2__Impl : ( ( rule__SafetyController__Group_2__0 )? ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3397:1: ( ( ( rule__SafetyController__Group_2__0 )? ) )
            // InternalDsl.g:3398:1: ( ( rule__SafetyController__Group_2__0 )? )
            {
            // InternalDsl.g:3398:1: ( ( rule__SafetyController__Group_2__0 )? )
            // InternalDsl.g:3399:2: ( rule__SafetyController__Group_2__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_2()); 
            // InternalDsl.g:3400:2: ( rule__SafetyController__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:3400:3: rule__SafetyController__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2__Impl"


    // $ANTLR start "rule__SafetyController__Group__3"
    // InternalDsl.g:3408:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3412:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalDsl.g:3413:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__SafetyController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3"


    // $ANTLR start "rule__SafetyController__Group__3__Impl"
    // InternalDsl.g:3420:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__Group_3__0 )? ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3424:1: ( ( ( rule__SafetyController__Group_3__0 )? ) )
            // InternalDsl.g:3425:1: ( ( rule__SafetyController__Group_3__0 )? )
            {
            // InternalDsl.g:3425:1: ( ( rule__SafetyController__Group_3__0 )? )
            // InternalDsl.g:3426:2: ( rule__SafetyController__Group_3__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_3()); 
            // InternalDsl.g:3427:2: ( rule__SafetyController__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:3427:3: rule__SafetyController__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3__Impl"


    // $ANTLR start "rule__SafetyController__Group__4"
    // InternalDsl.g:3435:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3439:1: ( rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 )
            // InternalDsl.g:3440:2: rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__SafetyController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4"


    // $ANTLR start "rule__SafetyController__Group__4__Impl"
    // InternalDsl.g:3447:1: rule__SafetyController__Group__4__Impl : ( ( rule__SafetyController__Group_4__0 )? ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3451:1: ( ( ( rule__SafetyController__Group_4__0 )? ) )
            // InternalDsl.g:3452:1: ( ( rule__SafetyController__Group_4__0 )? )
            {
            // InternalDsl.g:3452:1: ( ( rule__SafetyController__Group_4__0 )? )
            // InternalDsl.g:3453:2: ( rule__SafetyController__Group_4__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_4()); 
            // InternalDsl.g:3454:2: ( rule__SafetyController__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:3454:3: rule__SafetyController__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4__Impl"


    // $ANTLR start "rule__SafetyController__Group__5"
    // InternalDsl.g:3462:1: rule__SafetyController__Group__5 : rule__SafetyController__Group__5__Impl ;
    public final void rule__SafetyController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3466:1: ( rule__SafetyController__Group__5__Impl )
            // InternalDsl.g:3467:2: rule__SafetyController__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5"


    // $ANTLR start "rule__SafetyController__Group__5__Impl"
    // InternalDsl.g:3473:1: rule__SafetyController__Group__5__Impl : ( ( rule__SafetyController__Group_5__0 )? ) ;
    public final void rule__SafetyController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3477:1: ( ( ( rule__SafetyController__Group_5__0 )? ) )
            // InternalDsl.g:3478:1: ( ( rule__SafetyController__Group_5__0 )? )
            {
            // InternalDsl.g:3478:1: ( ( rule__SafetyController__Group_5__0 )? )
            // InternalDsl.g:3479:2: ( rule__SafetyController__Group_5__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_5()); 
            // InternalDsl.g:3480:2: ( rule__SafetyController__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:3480:3: rule__SafetyController__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__0"
    // InternalDsl.g:3489:1: rule__SafetyController__Group_2__0 : rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 ;
    public final void rule__SafetyController__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3493:1: ( rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 )
            // InternalDsl.g:3494:2: rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__SafetyController__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0"


    // $ANTLR start "rule__SafetyController__Group_2__0__Impl"
    // InternalDsl.g:3501:1: rule__SafetyController__Group_2__0__Impl : ( 'SoftLowerLimit' ) ;
    public final void rule__SafetyController__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3505:1: ( ( 'SoftLowerLimit' ) )
            // InternalDsl.g:3506:1: ( 'SoftLowerLimit' )
            {
            // InternalDsl.g:3506:1: ( 'SoftLowerLimit' )
            // InternalDsl.g:3507:2: 'SoftLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__1"
    // InternalDsl.g:3516:1: rule__SafetyController__Group_2__1 : rule__SafetyController__Group_2__1__Impl ;
    public final void rule__SafetyController__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3520:1: ( rule__SafetyController__Group_2__1__Impl )
            // InternalDsl.g:3521:2: rule__SafetyController__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1"


    // $ANTLR start "rule__SafetyController__Group_2__1__Impl"
    // InternalDsl.g:3527:1: rule__SafetyController__Group_2__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) ) ;
    public final void rule__SafetyController__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3531:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) ) )
            // InternalDsl.g:3532:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) )
            {
            // InternalDsl.g:3532:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) )
            // InternalDsl.g:3533:2: ( rule__SafetyController__SoftLowerLimitAssignment_2_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_2_1()); 
            // InternalDsl.g:3534:2: ( rule__SafetyController__SoftLowerLimitAssignment_2_1 )
            // InternalDsl.g:3534:3: rule__SafetyController__SoftLowerLimitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftLowerLimitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__0"
    // InternalDsl.g:3543:1: rule__SafetyController__Group_3__0 : rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 ;
    public final void rule__SafetyController__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3547:1: ( rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 )
            // InternalDsl.g:3548:2: rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__SafetyController__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0"


    // $ANTLR start "rule__SafetyController__Group_3__0__Impl"
    // InternalDsl.g:3555:1: rule__SafetyController__Group_3__0__Impl : ( 'SoftUpperLimit' ) ;
    public final void rule__SafetyController__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3559:1: ( ( 'SoftUpperLimit' ) )
            // InternalDsl.g:3560:1: ( 'SoftUpperLimit' )
            {
            // InternalDsl.g:3560:1: ( 'SoftUpperLimit' )
            // InternalDsl.g:3561:2: 'SoftUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__1"
    // InternalDsl.g:3570:1: rule__SafetyController__Group_3__1 : rule__SafetyController__Group_3__1__Impl ;
    public final void rule__SafetyController__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3574:1: ( rule__SafetyController__Group_3__1__Impl )
            // InternalDsl.g:3575:2: rule__SafetyController__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1"


    // $ANTLR start "rule__SafetyController__Group_3__1__Impl"
    // InternalDsl.g:3581:1: rule__SafetyController__Group_3__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) ) ;
    public final void rule__SafetyController__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3585:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) ) )
            // InternalDsl.g:3586:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) )
            {
            // InternalDsl.g:3586:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) )
            // InternalDsl.g:3587:2: ( rule__SafetyController__SoftUpperLimitAssignment_3_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_3_1()); 
            // InternalDsl.g:3588:2: ( rule__SafetyController__SoftUpperLimitAssignment_3_1 )
            // InternalDsl.g:3588:3: rule__SafetyController__SoftUpperLimitAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftUpperLimitAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_4__0"
    // InternalDsl.g:3597:1: rule__SafetyController__Group_4__0 : rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 ;
    public final void rule__SafetyController__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3601:1: ( rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 )
            // InternalDsl.g:3602:2: rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__SafetyController__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__0"


    // $ANTLR start "rule__SafetyController__Group_4__0__Impl"
    // InternalDsl.g:3609:1: rule__SafetyController__Group_4__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3613:1: ( ( 'k_position' ) )
            // InternalDsl.g:3614:1: ( 'k_position' )
            {
            // InternalDsl.g:3614:1: ( 'k_position' )
            // InternalDsl.g:3615:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_4__1"
    // InternalDsl.g:3624:1: rule__SafetyController__Group_4__1 : rule__SafetyController__Group_4__1__Impl ;
    public final void rule__SafetyController__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3628:1: ( rule__SafetyController__Group_4__1__Impl )
            // InternalDsl.g:3629:2: rule__SafetyController__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__1"


    // $ANTLR start "rule__SafetyController__Group_4__1__Impl"
    // InternalDsl.g:3635:1: rule__SafetyController__Group_4__1__Impl : ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) ;
    public final void rule__SafetyController__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3639:1: ( ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) )
            // InternalDsl.g:3640:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            {
            // InternalDsl.g:3640:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            // InternalDsl.g:3641:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 
            // InternalDsl.g:3642:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            // InternalDsl.g:3642:3: rule__SafetyController__K_positionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_positionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_5__0"
    // InternalDsl.g:3651:1: rule__SafetyController__Group_5__0 : rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 ;
    public final void rule__SafetyController__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3655:1: ( rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 )
            // InternalDsl.g:3656:2: rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__SafetyController__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__0"


    // $ANTLR start "rule__SafetyController__Group_5__0__Impl"
    // InternalDsl.g:3663:1: rule__SafetyController__Group_5__0__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3667:1: ( ( 'k_velocity' ) )
            // InternalDsl.g:3668:1: ( 'k_velocity' )
            {
            // InternalDsl.g:3668:1: ( 'k_velocity' )
            // InternalDsl.g:3669:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_5__1"
    // InternalDsl.g:3678:1: rule__SafetyController__Group_5__1 : rule__SafetyController__Group_5__1__Impl ;
    public final void rule__SafetyController__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3682:1: ( rule__SafetyController__Group_5__1__Impl )
            // InternalDsl.g:3683:2: rule__SafetyController__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__1"


    // $ANTLR start "rule__SafetyController__Group_5__1__Impl"
    // InternalDsl.g:3689:1: rule__SafetyController__Group_5__1__Impl : ( ( rule__SafetyController__K_velocityAssignment_5_1 ) ) ;
    public final void rule__SafetyController__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3693:1: ( ( ( rule__SafetyController__K_velocityAssignment_5_1 ) ) )
            // InternalDsl.g:3694:1: ( ( rule__SafetyController__K_velocityAssignment_5_1 ) )
            {
            // InternalDsl.g:3694:1: ( ( rule__SafetyController__K_velocityAssignment_5_1 ) )
            // InternalDsl.g:3695:2: ( rule__SafetyController__K_velocityAssignment_5_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5_1()); 
            // InternalDsl.g:3696:2: ( rule__SafetyController__K_velocityAssignment_5_1 )
            // InternalDsl.g:3696:3: rule__SafetyController__K_velocityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_velocityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalDsl.g:3705:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3709:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalDsl.g:3710:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalDsl.g:3717:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3721:1: ( ( RULE_INT ) )
            // InternalDsl.g:3722:1: ( RULE_INT )
            {
            // InternalDsl.g:3722:1: ( RULE_INT )
            // InternalDsl.g:3723:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalDsl.g:3732:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3736:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalDsl.g:3737:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalDsl.g:3744:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3748:1: ( ( '.' ) )
            // InternalDsl.g:3749:1: ( '.' )
            {
            // InternalDsl.g:3749:1: ( '.' )
            // InternalDsl.g:3750:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalDsl.g:3759:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3763:1: ( rule__FLOAT__Group__2__Impl )
            // InternalDsl.g:3764:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalDsl.g:3770:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3774:1: ( ( RULE_INT ) )
            // InternalDsl.g:3775:1: ( RULE_INT )
            {
            // InternalDsl.g:3775:1: ( RULE_INT )
            // InternalDsl.g:3776:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalDsl.g:3786:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3790:1: ( ( RULE_ID ) )
            // InternalDsl.g:3791:2: ( RULE_ID )
            {
            // InternalDsl.g:3791:2: ( RULE_ID )
            // InternalDsl.g:3792:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__LinkAssignment_2"
    // InternalDsl.g:3801:1: rule__Robot__LinkAssignment_2 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3805:1: ( ( ruleLink ) )
            // InternalDsl.g:3806:2: ( ruleLink )
            {
            // InternalDsl.g:3806:2: ( ruleLink )
            // InternalDsl.g:3807:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__LinkAssignment_2"


    // $ANTLR start "rule__Robot__JointAssignment_3"
    // InternalDsl.g:3816:1: rule__Robot__JointAssignment_3 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3820:1: ( ( ruleJoint ) )
            // InternalDsl.g:3821:2: ( ruleJoint )
            {
            // InternalDsl.g:3821:2: ( ruleJoint )
            // InternalDsl.g:3822:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_3"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalDsl.g:3831:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3835:1: ( ( RULE_ID ) )
            // InternalDsl.g:3836:2: ( RULE_ID )
            {
            // InternalDsl.g:3836:2: ( RULE_ID )
            // InternalDsl.g:3837:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_2"


    // $ANTLR start "rule__Link__InertialAssignment_3"
    // InternalDsl.g:3846:1: rule__Link__InertialAssignment_3 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3850:1: ( ( ruleInertial ) )
            // InternalDsl.g:3851:2: ( ruleInertial )
            {
            // InternalDsl.g:3851:2: ( ruleInertial )
            // InternalDsl.g:3852:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_3"


    // $ANTLR start "rule__Link__VisualsAssignment_4"
    // InternalDsl.g:3861:1: rule__Link__VisualsAssignment_4 : ( ruleVisual ) ;
    public final void rule__Link__VisualsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3865:1: ( ( ruleVisual ) )
            // InternalDsl.g:3866:2: ( ruleVisual )
            {
            // InternalDsl.g:3866:2: ( ruleVisual )
            // InternalDsl.g:3867:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualsAssignment_4"


    // $ANTLR start "rule__Link__CollisionAssignment_5"
    // InternalDsl.g:3876:1: rule__Link__CollisionAssignment_5 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3880:1: ( ( ruleCollision ) )
            // InternalDsl.g:3881:2: ( ruleCollision )
            {
            // InternalDsl.g:3881:2: ( ruleCollision )
            // InternalDsl.g:3882:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_5"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalDsl.g:3891:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3895:1: ( ( RULE_ID ) )
            // InternalDsl.g:3896:2: ( RULE_ID )
            {
            // InternalDsl.g:3896:2: ( RULE_ID )
            // InternalDsl.g:3897:3: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__TypeAssignment_2"
    // InternalDsl.g:3906:1: rule__Joint__TypeAssignment_2 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3910:1: ( ( ruleJointType ) )
            // InternalDsl.g:3911:2: ( ruleJointType )
            {
            // InternalDsl.g:3911:2: ( ruleJointType )
            // InternalDsl.g:3912:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_2"


    // $ANTLR start "rule__Joint__ChildOfAssignment_3"
    // InternalDsl.g:3921:1: rule__Joint__ChildOfAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__Joint__ChildOfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3925:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:3926:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:3926:2: ( ( RULE_STRING ) )
            // InternalDsl.g:3927:3: ( RULE_STRING )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0()); 
            // InternalDsl.g:3928:3: ( RULE_STRING )
            // InternalDsl.g:3929:4: RULE_STRING
            {
             before(grammarAccess.getJointAccess().getChildOfLinkSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildOfAssignment_3"


    // $ANTLR start "rule__Joint__ParentOfAssignment_4"
    // InternalDsl.g:3940:1: rule__Joint__ParentOfAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Joint__ParentOfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3944:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:3945:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:3945:2: ( ( RULE_STRING ) )
            // InternalDsl.g:3946:3: ( RULE_STRING )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_4_0()); 
            // InternalDsl.g:3947:3: ( RULE_STRING )
            // InternalDsl.g:3948:4: RULE_STRING
            {
             before(grammarAccess.getJointAccess().getParentOfLinkSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentOfAssignment_4"


    // $ANTLR start "rule__Joint__LimitAssignment_5"
    // InternalDsl.g:3959:1: rule__Joint__LimitAssignment_5 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3963:1: ( ( ruleLimit ) )
            // InternalDsl.g:3964:2: ( ruleLimit )
            {
            // InternalDsl.g:3964:2: ( ruleLimit )
            // InternalDsl.g:3965:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_5"


    // $ANTLR start "rule__Joint__AxisAssignment_6"
    // InternalDsl.g:3974:1: rule__Joint__AxisAssignment_6 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3978:1: ( ( ruleAxis ) )
            // InternalDsl.g:3979:2: ( ruleAxis )
            {
            // InternalDsl.g:3979:2: ( ruleAxis )
            // InternalDsl.g:3980:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_6"


    // $ANTLR start "rule__Joint__OriginAssignment_7"
    // InternalDsl.g:3989:1: rule__Joint__OriginAssignment_7 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3993:1: ( ( ruleOrigin ) )
            // InternalDsl.g:3994:2: ( ruleOrigin )
            {
            // InternalDsl.g:3994:2: ( ruleOrigin )
            // InternalDsl.g:3995:3: ruleOrigin
            {
             before(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_7"


    // $ANTLR start "rule__Joint__CalibrationAssignment_8"
    // InternalDsl.g:4004:1: rule__Joint__CalibrationAssignment_8 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4008:1: ( ( ruleCalibration ) )
            // InternalDsl.g:4009:2: ( ruleCalibration )
            {
            // InternalDsl.g:4009:2: ( ruleCalibration )
            // InternalDsl.g:4010:3: ruleCalibration
            {
             before(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__CalibrationAssignment_8"


    // $ANTLR start "rule__Joint__DynamicsAssignment_9"
    // InternalDsl.g:4019:1: rule__Joint__DynamicsAssignment_9 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4023:1: ( ( ruleDynamics ) )
            // InternalDsl.g:4024:2: ( ruleDynamics )
            {
            // InternalDsl.g:4024:2: ( ruleDynamics )
            // InternalDsl.g:4025:3: ruleDynamics
            {
             before(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__DynamicsAssignment_9"


    // $ANTLR start "rule__Joint__MimicAssignment_10"
    // InternalDsl.g:4034:1: rule__Joint__MimicAssignment_10 : ( ruleMimic ) ;
    public final void rule__Joint__MimicAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4038:1: ( ( ruleMimic ) )
            // InternalDsl.g:4039:2: ( ruleMimic )
            {
            // InternalDsl.g:4039:2: ( ruleMimic )
            // InternalDsl.g:4040:3: ruleMimic
            {
             before(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__MimicAssignment_10"


    // $ANTLR start "rule__Joint__SafetycontrollerAssignment_11"
    // InternalDsl.g:4049:1: rule__Joint__SafetycontrollerAssignment_11 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4053:1: ( ( ruleSafetyController ) )
            // InternalDsl.g:4054:2: ( ruleSafetyController )
            {
            // InternalDsl.g:4054:2: ( ruleSafetyController )
            // InternalDsl.g:4055:3: ruleSafetyController
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__SafetycontrollerAssignment_11"


    // $ANTLR start "rule__Inertial__OriginAssignment_0"
    // InternalDsl.g:4064:1: rule__Inertial__OriginAssignment_0 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4068:1: ( ( ruleOrigin ) )
            // InternalDsl.g:4069:2: ( ruleOrigin )
            {
            // InternalDsl.g:4069:2: ( ruleOrigin )
            // InternalDsl.g:4070:3: ruleOrigin
            {
             before(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__OriginAssignment_0"


    // $ANTLR start "rule__Inertial__MassAssignment_1"
    // InternalDsl.g:4079:1: rule__Inertial__MassAssignment_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4083:1: ( ( ruleMass ) )
            // InternalDsl.g:4084:2: ( ruleMass )
            {
            // InternalDsl.g:4084:2: ( ruleMass )
            // InternalDsl.g:4085:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_1"


    // $ANTLR start "rule__Inertial__InertiaAssignment_2"
    // InternalDsl.g:4094:1: rule__Inertial__InertiaAssignment_2 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4098:1: ( ( ruleInertia ) )
            // InternalDsl.g:4099:2: ( ruleInertia )
            {
            // InternalDsl.g:4099:2: ( ruleInertia )
            // InternalDsl.g:4100:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_2"


    // $ANTLR start "rule__Visual__MaterialAssignment_0"
    // InternalDsl.g:4109:1: rule__Visual__MaterialAssignment_0 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4113:1: ( ( ruleMaterial ) )
            // InternalDsl.g:4114:2: ( ruleMaterial )
            {
            // InternalDsl.g:4114:2: ( ruleMaterial )
            // InternalDsl.g:4115:3: ruleMaterial
            {
             before(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__MaterialAssignment_0"


    // $ANTLR start "rule__Visual__OriginAssignment_1"
    // InternalDsl.g:4124:1: rule__Visual__OriginAssignment_1 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4128:1: ( ( ruleOrigin ) )
            // InternalDsl.g:4129:2: ( ruleOrigin )
            {
            // InternalDsl.g:4129:2: ( ruleOrigin )
            // InternalDsl.g:4130:3: ruleOrigin
            {
             before(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__OriginAssignment_1"


    // $ANTLR start "rule__Visual__GeometryAssignment_2"
    // InternalDsl.g:4139:1: rule__Visual__GeometryAssignment_2 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4143:1: ( ( ruleGeometry ) )
            // InternalDsl.g:4144:2: ( ruleGeometry )
            {
            // InternalDsl.g:4144:2: ( ruleGeometry )
            // InternalDsl.g:4145:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_2"


    // $ANTLR start "rule__Collision__GeometryAssignment_0"
    // InternalDsl.g:4154:1: rule__Collision__GeometryAssignment_0 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4158:1: ( ( ruleGeometry ) )
            // InternalDsl.g:4159:2: ( ruleGeometry )
            {
            // InternalDsl.g:4159:2: ( ruleGeometry )
            // InternalDsl.g:4160:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__GeometryAssignment_0"


    // $ANTLR start "rule__Collision__OriginAssignment_1"
    // InternalDsl.g:4169:1: rule__Collision__OriginAssignment_1 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4173:1: ( ( ruleOrigin ) )
            // InternalDsl.g:4174:2: ( ruleOrigin )
            {
            // InternalDsl.g:4174:2: ( ruleOrigin )
            // InternalDsl.g:4175:3: ruleOrigin
            {
             before(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_1"


    // $ANTLR start "rule__Origin__XAssignment_2"
    // InternalDsl.g:4184:1: rule__Origin__XAssignment_2 : ( ruleFLOAT ) ;
    public final void rule__Origin__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4188:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4189:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4189:2: ( ruleFLOAT )
            // InternalDsl.g:4190:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__XAssignment_2"


    // $ANTLR start "rule__Origin__YAssignment_3"
    // InternalDsl.g:4199:1: rule__Origin__YAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Origin__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4203:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4204:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4204:2: ( ruleFLOAT )
            // InternalDsl.g:4205:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YAssignment_3"


    // $ANTLR start "rule__Origin__ZAssignment_4"
    // InternalDsl.g:4214:1: rule__Origin__ZAssignment_4 : ( ruleFLOAT ) ;
    public final void rule__Origin__ZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4218:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4219:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4219:2: ( ruleFLOAT )
            // InternalDsl.g:4220:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__ZAssignment_4"


    // $ANTLR start "rule__Origin__RollAssignment_5"
    // InternalDsl.g:4229:1: rule__Origin__RollAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__Origin__RollAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4233:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4234:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4234:2: ( ruleFLOAT )
            // InternalDsl.g:4235:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__RollAssignment_5"


    // $ANTLR start "rule__Origin__PitchAssignment_6"
    // InternalDsl.g:4244:1: rule__Origin__PitchAssignment_6 : ( ruleFLOAT ) ;
    public final void rule__Origin__PitchAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4248:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4249:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4249:2: ( ruleFLOAT )
            // InternalDsl.g:4250:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__PitchAssignment_6"


    // $ANTLR start "rule__Origin__YawAssignment_7"
    // InternalDsl.g:4259:1: rule__Origin__YawAssignment_7 : ( ruleFLOAT ) ;
    public final void rule__Origin__YawAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4263:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4264:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4264:2: ( ruleFLOAT )
            // InternalDsl.g:4265:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YawAssignment_7"


    // $ANTLR start "rule__Limit__LowerAssignment_2"
    // InternalDsl.g:4274:1: rule__Limit__LowerAssignment_2 : ( ruleFLOAT ) ;
    public final void rule__Limit__LowerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4278:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4279:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4279:2: ( ruleFLOAT )
            // InternalDsl.g:4280:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_2"


    // $ANTLR start "rule__Limit__UpperAssignment_3"
    // InternalDsl.g:4289:1: rule__Limit__UpperAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Limit__UpperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4293:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4294:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4294:2: ( ruleFLOAT )
            // InternalDsl.g:4295:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_3"


    // $ANTLR start "rule__Limit__EffortAssignment_4"
    // InternalDsl.g:4304:1: rule__Limit__EffortAssignment_4 : ( ruleFLOAT ) ;
    public final void rule__Limit__EffortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4308:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4309:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4309:2: ( ruleFLOAT )
            // InternalDsl.g:4310:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_4"


    // $ANTLR start "rule__Limit__VelocityAssignment_5"
    // InternalDsl.g:4319:1: rule__Limit__VelocityAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__Limit__VelocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4323:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4324:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4324:2: ( ruleFLOAT )
            // InternalDsl.g:4325:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_5"


    // $ANTLR start "rule__Axis__XAssignment_2_1"
    // InternalDsl.g:4334:1: rule__Axis__XAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Axis__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4338:1: ( ( RULE_INT ) )
            // InternalDsl.g:4339:2: ( RULE_INT )
            {
            // InternalDsl.g:4339:2: ( RULE_INT )
            // InternalDsl.g:4340:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XAssignment_2_1"


    // $ANTLR start "rule__Axis__YAssignment_3_1"
    // InternalDsl.g:4349:1: rule__Axis__YAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Axis__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4353:1: ( ( RULE_INT ) )
            // InternalDsl.g:4354:2: ( RULE_INT )
            {
            // InternalDsl.g:4354:2: ( RULE_INT )
            // InternalDsl.g:4355:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__YAssignment_3_1"


    // $ANTLR start "rule__Axis__ZAssignment_4_1"
    // InternalDsl.g:4364:1: rule__Axis__ZAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Axis__ZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4368:1: ( ( RULE_INT ) )
            // InternalDsl.g:4369:2: ( RULE_INT )
            {
            // InternalDsl.g:4369:2: ( RULE_INT )
            // InternalDsl.g:4370:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__ZAssignment_4_1"


    // $ANTLR start "rule__Calibration__RisingAssignment_2_1"
    // InternalDsl.g:4379:1: rule__Calibration__RisingAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Calibration__RisingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4383:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4384:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4384:2: ( ruleFLOAT )
            // InternalDsl.g:4385:3: ruleFLOAT
            {
             before(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__RisingAssignment_2_1"


    // $ANTLR start "rule__Calibration__FallingAssignment_3_1"
    // InternalDsl.g:4394:1: rule__Calibration__FallingAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Calibration__FallingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4398:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4399:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4399:2: ( ruleFLOAT )
            // InternalDsl.g:4400:3: ruleFLOAT
            {
             before(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__FallingAssignment_3_1"


    // $ANTLR start "rule__Dynamics__FrictionAssignment_2_1"
    // InternalDsl.g:4409:1: rule__Dynamics__FrictionAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Dynamics__FrictionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4413:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4414:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4414:2: ( ruleFLOAT )
            // InternalDsl.g:4415:3: ruleFLOAT
            {
             before(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__FrictionAssignment_2_1"


    // $ANTLR start "rule__Dynamics__DampingAssignment_3_1"
    // InternalDsl.g:4424:1: rule__Dynamics__DampingAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Dynamics__DampingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4428:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4429:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4429:2: ( ruleFLOAT )
            // InternalDsl.g:4430:3: ruleFLOAT
            {
             before(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__DampingAssignment_3_1"


    // $ANTLR start "rule__Mimic__MultiplierAssignment_2_1"
    // InternalDsl.g:4439:1: rule__Mimic__MultiplierAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Mimic__MultiplierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4443:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4444:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4444:2: ( ruleFLOAT )
            // InternalDsl.g:4445:3: ruleFLOAT
            {
             before(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__MultiplierAssignment_2_1"


    // $ANTLR start "rule__Mimic__OffSetAssignment_3_1"
    // InternalDsl.g:4454:1: rule__Mimic__OffSetAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Mimic__OffSetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4458:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4459:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4459:2: ( ruleFLOAT )
            // InternalDsl.g:4460:3: ruleFLOAT
            {
             before(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__OffSetAssignment_3_1"


    // $ANTLR start "rule__SafetyController__SoftLowerLimitAssignment_2_1"
    // InternalDsl.g:4469:1: rule__SafetyController__SoftLowerLimitAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4473:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4474:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4474:2: ( ruleFLOAT )
            // InternalDsl.g:4475:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftLowerLimitAssignment_2_1"


    // $ANTLR start "rule__SafetyController__SoftUpperLimitAssignment_3_1"
    // InternalDsl.g:4484:1: rule__SafetyController__SoftUpperLimitAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4488:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4489:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4489:2: ( ruleFLOAT )
            // InternalDsl.g:4490:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftUpperLimitAssignment_3_1"


    // $ANTLR start "rule__SafetyController__K_positionAssignment_4_1"
    // InternalDsl.g:4499:1: rule__SafetyController__K_positionAssignment_4_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__K_positionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4503:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4504:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4504:2: ( ruleFLOAT )
            // InternalDsl.g:4505:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_positionAssignment_4_1"


    // $ANTLR start "rule__SafetyController__K_velocityAssignment_5_1"
    // InternalDsl.g:4514:1: rule__SafetyController__K_velocityAssignment_5_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__K_velocityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4518:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:4519:2: ( ruleFLOAT )
            {
            // InternalDsl.g:4519:2: ( ruleFLOAT )
            // InternalDsl.g:4520:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_velocityAssignment_5_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\1\25\uffff";
    static final String dfa_3s = "\1\20\1\uffff\1\4\1\56\1\uffff\2\4\1\56\2\4\1\56\2\4\1\56\2\4\1\56\2\4\1\56\1\4\1\23";
    static final String dfa_4s = "\1\32\1\uffff\1\32\1\56\1\uffff\1\4\1\32\1\56\1\4\1\32\1\56\1\4\1\32\1\56\1\4\1\32\1\56\1\4\1\32\1\56\1\4\1\32";
    static final String dfa_5s = "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\2\uffff\6\1",
            "",
            "\1\3\16\uffff\1\4\3\uffff\4\1",
            "\1\5",
            "",
            "\1\6",
            "\1\7\16\uffff\1\4\3\uffff\4\1",
            "\1\10",
            "\1\11",
            "\1\12\16\uffff\1\4\3\uffff\4\1",
            "\1\13",
            "\1\14",
            "\1\15\16\uffff\1\4\3\uffff\4\1",
            "\1\16",
            "\1\17",
            "\1\20\16\uffff\1\4\3\uffff\4\1",
            "\1\21",
            "\1\22",
            "\1\23\16\uffff\1\4\3\uffff\4\1",
            "\1\24",
            "\1\25",
            "\1\4\3\uffff\4\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 970:2: ( rule__Link__InertialAssignment_3 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007E40000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000640002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000024900000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});

}